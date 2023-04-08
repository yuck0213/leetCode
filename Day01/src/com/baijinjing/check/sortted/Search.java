package com.baijinjing.check.sortted;

public class Search {

    static int[] nums = {1, 3, 4, 5, 6, 8, 9, 10, 15, 17, 18};

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (target == nums[middle]) {
                return middle;
            } else if (target < nums[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int search = search(nums, 10);
        System.out.println(search);
    }
}
