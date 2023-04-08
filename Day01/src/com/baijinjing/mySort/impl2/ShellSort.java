package com.baijinjing.mySort.impl2;

import com.baijinjing.mySort.MySort;
import com.baijinjing.mySort.tools.CheckSort;

public class ShellSort implements MySort {
    @Override
    public void sort(int[] arr) {
        shell(arr,arr.length);
    }

    private void shell(int[] arr, int len) {
        if (len <= 1)
            return;
        len = len >> 1;
        for (int i = len; i < arr.length; i++) {
            int insertVal = arr[i], index = i - len;
            while (index >= 0 && insertVal < arr[index]) {
                arr[index + len] = arr[index];
                index = index-len;
            }
            arr[index+len] = insertVal;
        }
        shell(arr,len);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,5,9,7,8,6,3,4};
        ShellSort shellSort = new ShellSort();
        boolean res = CheckSort.start(shellSort);
        System.out.println(res);
    }
}
