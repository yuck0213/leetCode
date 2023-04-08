package com.baijinjing.check.tools;

import com.baijinjing.check.MySort;

import java.util.Arrays;
import java.util.Random;

public class CheckSort2 {
    final static int MAX_LEN = 10000;
    final static int MAX_VAL = 10000;

    public static boolean start(MySort mySort){
        boolean result = true;
        for (int i = 0; i < 1000; i++) {
            int[] arr = generateRandomArrays();
            int[] copy = copyArrays(arr);
            mySort.sort(arr);
            sortCopy(copy);
            if (!check(arr,copy))
                result = false;
        }
        return result;
    }

    private static boolean check(int[] arr,int[] copy){
        if (arr.length == 0 || copy.length == 0)
            return true;
        if (arr == null && copy == null)
            return true;
        if (arr == null && copy != null || arr != null && copy == null)
            return false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=copy[i])
                return false;
        }
        return true;
    }

    private static int[] generateRandomArrays(){
        Random random = new Random();
        int[] arr = new int[random.nextInt(MAX_LEN)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(MAX_VAL);
        }
        return arr;
    }

    private static int[] copyArrays(int[] arr){
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    private static void sortCopy(int[] copy){
        Arrays.sort(copy);
    }


}
