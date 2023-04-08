package com.baijinjing.mySort.impl;

import com.baijinjing.mySort.MySort;
import com.baijinjing.mySort.tools.CheckSort;

public class MergeSort implements MySort {
    @Override
    public void sort(int[] arr) {
        int[] result = new int[arr.length];
        merge(0,arr.length-1,arr,result);
    }

    private void merge(int left, int right, int[] arr, int[] result) {
        if (left >= right)
            return;
        int len = right - left, mid = (len >> 1) + left;
        int left1 = left, right1 = mid;
        int left2 = mid + 1, right2 = right;
        merge(left1, right1, arr, result);
        merge(left2, right2, arr, result);
        int k = left;
        while (left1 <= right1 && left2 <= right2)
            result[k++] = arr[left1] < arr[left2] ? arr[left1++] : arr[left2++];
        while (left1 <= right1)
            result[k++] = arr[left1++];
        while (left2 <= right2)
            result[k++] = arr[left2++];
        for (k = left; k <= right; k++) {
            arr[k] = result[k];
        }
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        boolean res = CheckSort.start(mergeSort);
        System.out.println(res);
    }
}
