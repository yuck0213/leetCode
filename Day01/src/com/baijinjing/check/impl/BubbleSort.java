package com.baijinjing.check.impl;

import com.baijinjing.check.MySort;

public class BubbleSort implements MySort {
    public void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1 ; j++) {
                if (arr[j+1]<arr[j]){
                    int temp;
                    temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
    }

}
