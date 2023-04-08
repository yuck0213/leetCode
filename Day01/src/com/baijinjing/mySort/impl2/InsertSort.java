package com.baijinjing.mySort.impl2;

import com.baijinjing.mySort.MySort;
import com.baijinjing.mySort.tools.CheckSort;

public class InsertSort implements MySort {
    @Override
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int insertVal = arr[i];
            int index = i - 1;
            while (index >= 0 && insertVal < arr[index]) {
                arr[index+1] = arr[index--];
            }
            arr[index+1] = insertVal;
        }
    }

    public static void main(String[] args) {
        boolean res = CheckSort.start(new InsertSort());
        System.out.println(res);
    }
}
