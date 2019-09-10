package com.zju.cst.algorithm_note;

/**
 * @author wulixz
 * @date 9/9/19 : 10:04 AM
 * @introduction :
 */
public class LongComSeq {
    public int longCommonSubSequence(char[] Arr, char [] Brr){
        int[][] dp = new int[Arr.length + 1][Brr.length + 1];
        //空出一排行与列，初始为 0
        for (int i = 1 ; i <= Arr.length; i ++){
            for (int j = 1; j <= Brr.length ; j ++){
                //确定状态转移方程
                if (Arr[i-1] == Brr[j-1]){
                    dp[i][j] = dp[i -1 ][j -1 ] + 1;//重点思考这里
                }else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j-1]);
                }
            }
        }
        return dp[Arr.length][Brr.length];
    }
}
