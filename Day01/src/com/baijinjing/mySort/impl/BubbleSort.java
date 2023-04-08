package com.baijinjing.mySort.impl;

import com.baijinjing.mySort.MySort;
import com.baijinjing.mySort.tools.CheckSort;

public class BubbleSort implements MySort{

    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-(i+1); j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        boolean res = CheckSort.start(bubbleSort);
        System.out.println(res);
    }
}
