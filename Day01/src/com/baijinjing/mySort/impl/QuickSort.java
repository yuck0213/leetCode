package com.baijinjing.mySort.impl;

import com.baijinjing.mySort.MySort;
import com.baijinjing.mySort.tools.CheckSort;

public class QuickSort implements MySort {
    @Override
    public void sort(int[] arr) {
        quick(0,arr.length-1,arr);
    }

    private void quick(int left, int right, int[] arr) {
        if (left >= right)
            return;
        int i = left, j = right, pivot = arr[left];
        while (i < j) {
            while (i < j && pivot <= arr[j])
                j--;
            if (i < j)
                arr[i++] = arr[j];
            while (i<j && pivot >= arr[i])
                i++;
            if (i<j)
                arr[j--] =arr[i];
        }
        arr[i] = pivot;
        quick(left,i-1,arr);
        quick(i+1,right,arr);
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        boolean res = CheckSort.start(quickSort);
        System.out.println(res);

    }
}
