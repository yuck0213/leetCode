package com.baijinjing.mySort.impl2;

import com.baijinjing.mySort.MySort;

public class QuickSort implements MySort {
    @Override
    public void sort(int[] arr) {
        quick(0, arr.length - 1, arr);
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
            while (i < j && pivot >= arr[i])
                i++;
            if (i < j)
                arr[j--] = arr[i];

        }
        arr[i] = pivot;
        quick(left, i - 1, arr);
        quick(i + 1, right, arr);
    }

    public static void main(String[] args) {
        int[] nums = {3, 7, 6, 2, 4};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
