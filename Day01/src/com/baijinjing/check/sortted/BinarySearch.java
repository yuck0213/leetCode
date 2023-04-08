package com.baijinjing.check.sortted;

public class BinarySearch {

    static int[] nums = {1, 3, 5, 7, 9, 12, 15, 19};

    //使用二分法的前提是数组有序
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left+((right - left) >> 1);
            if (target < nums[mid]) {
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int result = BinarySearch.search(nums, 15);
        System.out.println(result);
    }
}
