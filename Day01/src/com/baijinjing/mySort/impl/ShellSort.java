package com.baijinjing.mySort.impl;

import com.baijinjing.mySort.MySort;
import com.baijinjing.mySort.tools.CheckSort;

public class ShellSort implements MySort {
    @Override
    public void sort(int[] arr) {
        shell(arr,arr.length);
    }

    private void shell(int[] arr, int initLen) {
        if (initLen > 1){
            int len = initLen >> 1;
            for (int i = len; i < arr.length; i++) {
                int pivot = arr[i];
                int index = i - len;
                while (index >= 0 && pivot < arr[index]){
                    arr[index+len] = arr[index];
                    index -= len;
                }
                arr[index+len] = pivot;
            }
            shell(arr,len);
        }
    }

    public static void main(String[] args) {
        ShellSort sort = new ShellSort();
        boolean res = CheckSort.start(sort);
        System.out.println(res);
    }
}
