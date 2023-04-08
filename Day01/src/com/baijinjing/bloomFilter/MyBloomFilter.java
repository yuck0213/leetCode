package com.baijinjing.bloomFilter;

import java.util.BitSet;
import java.util.HashMap;

public class MyBloomFilter {
    private static final int DEFAULT_SIZE = 256 << 22;

    private static final int[] SEEDS = {3, 5, 7, 11, 13, 31, 37, 61};

    private  HashFunction[] functions = new HashFunction[SEEDS.length];

    private  BitSet bitSet = new BitSet(DEFAULT_SIZE);


    public MyBloomFilter(){
        for (int i = 0; i < SEEDS.length; i++) {
            functions[i] = new HashFunction(DEFAULT_SIZE,SEEDS[i]);
        }
    }

    public  void add(String value) {
        if (value != null) {
            for (HashFunction f : functions) {
                bitSet.set(f.hash(value), true);
            }
        }
    }

    public  boolean contains(String value) {
        if (value==null)
            return false;
        Boolean res = true;
        for (HashFunction f : functions) {
             res = bitSet.get(f.hash(value));
            if (!res)
                break;
        }
        return res;
    }

    class HashFunction {
        private int size;
        private int seed;

        private HashFunction(int size, int seed) {
            this.size = size;
            this.seed = seed;
        }

        private int hash(String value) {
            int len = value.length();
            int result = 0;
            for (int i = 0; i < len; i++) {
                result = seed * result + value.charAt(i);
            }
            int r = (size - 1) & result;
            return r;
        }
    }
}
