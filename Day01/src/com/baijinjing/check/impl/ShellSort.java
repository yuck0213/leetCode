package com.baijinjing.check.impl;

import com.baijinjing.check.MySort;
import com.baijinjing.check.tools.CheckSort;

public class ShellSort implements MySort {
    @Override
    public void sort(int[] arr) {
        int length = arr.length;
        shellSort(arr, length);
    }


    public void shellSort(int[] arr, int initLen) {
        if (initLen > 1) {
            int len = initLen / 2;
            for (int i = len; i < arr.length; i++) {
                int x = arr[i];
                int index = i - len;
                while (index >= 0 && x < arr[index]) {
                    arr[index+len] = arr[index];
                    index-=len;
                }
                arr[index+len] = x;
            }
            shellSort(arr, len);
        }

    }

    public static void main(String[] args) {
        ShellSort sort = new ShellSort();
        Boolean res = CheckSort.start(sort);
        System.out.println(res);
    }
}
