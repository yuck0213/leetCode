package com.baijinjing.search;

public class Search {

    public static int search(int nums[], int target) {
        int len = nums.length;
        int left = 0, right = len - 1;
        int middle = left + ((right - left) / 2);
        while (left <= right) {
            //说明目标值在中点右边
            if (nums[middle]<target){
                 left = middle+1;
                //目标值在中点左边
            }else if(nums[middle]>target){
                 right = middle - 1;
            }else{
                 return middle;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {1,3,5,7,9};

        int search = Search.search(nums, 5);
        System.out.println(search);
    }
}
