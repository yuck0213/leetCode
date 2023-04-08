package com.baijinjing;

public class IntegerBreak {


    public static int intBreak(int n) {
        if(n==2)
            return 1;
        int len = n >>1;
        int[] dp = new int[len+2];
        dp[1] = 0;
        for(int i = 2;i < len+2;i++){
            int a = n/i;
            int b = (n-a*(i-1));
            dp[i] = Math.max((int)(Math.pow(a,(i-1))*b),dp[i-1]);
        }
        return dp[len+1];
    }


}
