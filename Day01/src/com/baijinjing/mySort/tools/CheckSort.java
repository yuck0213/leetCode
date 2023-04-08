package com.baijinjing.mySort.tools;

import com.baijinjing.mySort.MySort;

import java.util.Arrays;
import java.util.Random;

public class CheckSort {

    private static int MAX_VAL = 10000;

    private static int MAX_LEN = 1000;

    public static boolean start(MySort mySort) {
        boolean res = true;
        for (int i = 0; i < 1000; i++) {
            int[] arr = generationArrays();
            int[] copy = copyArrays(arr);
            mySort.sort(arr);
            copySort(copy);
            if (!check(arr, copy)) {
                res = false;
            }
        }
        return res;
    }

    private static boolean check(int[] arr, int[] copy) {
        if (arr.length == 0 && copy.length == 0)
            return true;
        if (arr == null && copy == null)
            return true;
        if (arr == null && copy != null || arr != null && copy == null)
            return false;
        boolean result = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != copy[i])
                return false;
        }
        return result;
    }

    private static int[] generationArrays() {
        Random random = new Random();
        int[] arr = new int[random.nextInt(MAX_VAL)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(MAX_LEN);
        }
        return arr;
    }


    private static int[] copyArrays(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    private static void copySort(int[] copy) {
        Arrays.sort(copy);
    }


}
