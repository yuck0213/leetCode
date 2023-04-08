package com.baijinjing.minSubArrayLen;

public class Test {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int target = 15;
        Solution solution = new Solution();
        int len = solution.minSubArrayLen(nums, target);
        System.out.println(len);
    }
}
