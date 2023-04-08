package com.baijinjing.check.tools;

import com.baijinjing.check.MySort;

import java.util.Arrays;
import java.util.Random;

public class CheckSort {

    static int maxVal = 10000;
    static int maxLen = 10000;
    public static Boolean start(MySort mySort){
        Boolean result = true;
        for (int i = 0; i < 1000; i++) {
            int[] arr1 = generateRandomArray();
            int[] arr2 = copyArray(arr1);
            mySort.sort(arr1);
            comparator(arr2);
            if (check(arr1,arr2)==false)
                result = false;
        }
        return result;
    }

    /*
     * 生成随机数组
     * */
    public static int[] generateRandomArray() {
        Random r = new Random();
        int[] arr = new int[r.nextInt(maxLen)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(maxVal);
        }
        return arr;
    }

    /*
     * 遍历对比两个数组是否一样
     * */
    public static boolean check(int[] arr1, int[] arr2) {
        if (arr1.length == 0 || arr2.length == 0)
            return true;
        if (arr1 == null && arr2 == null)
            return true;
        if (arr1 == null && arr2 != null || arr1 != null && arr2 == null)
            return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }

    /*
     * 调用Arrays.sort 作为参照标准
     * */
    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    /*
     * 复制一份目标数组
     * */
    public static int[] copyArray(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }
}
