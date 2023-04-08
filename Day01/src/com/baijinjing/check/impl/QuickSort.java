package com.baijinjing.check.impl;

import com.baijinjing.check.MySort;

public class QuickSort implements MySort {
    @Override
    public void sort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        quick_sort(left, right, arr);
    }

    public void quick_sort(int left, int right, int[] arr) {
        if (left < right) {
            int i = left, j = right, pivot = arr[left];
            while (i < j) {
                while (i < j && pivot <= arr[j])
                    j--;
                if (i < j) {
                    arr[i] = arr[j];
                    i++;
                }
                while (i < j && pivot > arr[i])
                    i++;
                if (i < j) {
                    arr[j] = arr[i];
                    j--;
                }
            }
            arr[i] = pivot;
            quick_sort(left, i - 1, arr);
            quick_sort(i + 1, right, arr);
        }
    }
}
