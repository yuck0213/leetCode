package com.baijinjing;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        int[] sum = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((target - nums[i]) == nums[j]) {
                    sum[0] = i;
                    sum[1] = j;
                    return sum;
                }
            }
        }
        return sum;
    }
}
