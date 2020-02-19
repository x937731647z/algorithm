package com.zju.cst.algorithm_note;

/**
 * @author wulixz
 * @date 9/8/19 : 2:53 PM
 * @introduction :
 */
public class Fibonacci {
    int[] dp = new int[10010];
    int F(int num){
        if( num == 1 || num == 2)return 1;
        if (dp[num] != 0)return dp[num];
        else {
            dp[num] = F(num -1) + F(num - 2);
            return dp[num];
        }
    }
}

