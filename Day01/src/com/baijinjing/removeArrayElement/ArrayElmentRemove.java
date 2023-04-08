package com.baijinjing.removeArrayElement;

public class ArrayElmentRemove {


    public int remove(int[] nums, int target) {
        int fast ;
        int slow = 0;
        for ( fast = 0; fast <nums.length ; fast++) {

            if (nums[fast] != target){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
