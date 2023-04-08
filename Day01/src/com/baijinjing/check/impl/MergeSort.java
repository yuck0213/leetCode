package com.baijinjing.check.impl;

import com.baijinjing.check.MySort;
import com.baijinjing.check.tools.CheckSort;

public class MergeSort implements MySort {
    @Override
    public void sort(int[] arr) {
        int len = arr.length;
        int[] result = new int[len];
        merge(arr, result, 0, len - 1);
    }

    public void merge(int[] arr, int[] result, int start, int end) {
        if (start >= end)
            return;

        int len = end - start, mid = (len >> 1) + start;
        int start1 = start, end1 = mid;
        int start2 = mid + 1, end2 = end;
        merge(arr, result, start1, end1);
        merge(arr, result, start2, end2);
        int k = start;
        while (start1 <= end1 && start2 <= end2) {
            result[k++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
        }
        while (start1 <= end1) {
            result[k++] = arr[start1++];
        }
        while (start2 <= end2) {
            result[k++] = arr[start2++];
        }
        for (k = start; k <= end; k++)
            arr[k] = result[k];
    }

    public static void main(String[] args) {
        int[] arr = {15, 12, 23, 8, 7, 9, 13, 19};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr);
    }
}
