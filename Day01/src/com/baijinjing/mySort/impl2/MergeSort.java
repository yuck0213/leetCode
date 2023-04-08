package com.baijinjing.mySort.impl2;

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
        int mid = left + ((right - left) >> 1);
        int l1 = left, r1 = mid;
        int l2 = mid + 1, r2 = right;
        merge(l1, r1, arr, result);
        merge(l2, r2, arr, result);
        int k = left;
        while (l1 <= r1 && l2 <= r2)
            result[k++] = arr[l1] < arr[l2] ? arr[l1++] : arr[l2++];
        while (l1 <= r1)
            result[k++] = arr[l1++];
        while (l2 <= r2)
            result[k++] = arr[l2++];
        for (int i = left; i <=right ; i++) {
            arr[i] = result[i];
        }
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        boolean res = CheckSort.start(mergeSort);
        System.out.println(res);
    }
}
