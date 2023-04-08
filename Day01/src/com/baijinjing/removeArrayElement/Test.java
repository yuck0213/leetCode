package com.baijinjing.removeArrayElement;

public class Test {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,8,7,9,6,3};
        ArrayElmentRemove arrayElmentRemove = new ArrayElmentRemove();
        int len= arrayElmentRemove.remove(nums, 3);
        for(int i = 0;i<len;i++){
            System.out.print(nums[i]+" ");
        }

    }
}
