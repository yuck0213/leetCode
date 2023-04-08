package com.baijinjing.lengthOfLongestSubstring;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int[] counts = new int[26];
        int pre = 0;

        for (int i = 0; i < chars.length - 1; i++) {

            return pre;
        }
        return 0;
    }
}
