package com.baijinjing.lengthOfLongestSubstring;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        String abc = "abcabcbb";
//        Solution solution = new Solution();
//        int result = solution.lengthOfLongestSubstring(abc);
//        System.out.println(result);

        char a = 'a';
        int[] counts = new int[26];

//        System.out.println(counts[0]);


        int[] nums = {2,1,5,6,8,9,7,4,1,2,3,2,1,4,2};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        Arrays.sort(nums);
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
