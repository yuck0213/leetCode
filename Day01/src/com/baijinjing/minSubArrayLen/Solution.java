package com.baijinjing.minSubArrayLen;

public class Solution {

    public int minSubArrayLen(int[] nums, int target) {
        int result = nums.length+1;
        int i = 0;
        int sum = 0;

        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= target) {
                int L = j - i + 1;
                result = Math.min(result, L);
                sum -= nums[i++];
            }
        }
        return result == nums.length+1 ? 0 : result;
    }
}
