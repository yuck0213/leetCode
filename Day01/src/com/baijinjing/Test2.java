package com.baijinjing;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.next();
        String[] split = str.split(",");
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        func(arr);
    }

    public static void func(int[] arr) {
        temp(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void temp(int[] arr) {
        int[] results = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            results[i] = arr[i];
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                arr[i] -= 1;
            } else if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                arr[i] += 1;
            }
        }

        boolean res = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != results[i]){
                res = false;
                break;
            }
        }
        if (!res) {
            temp(arr);
        }else {
            return;
        }
    }
}
