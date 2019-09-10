package com.zju.cst.algorithm_note;

/**
 * @author wulixz
 * @date 9/8/19 : 8:37 PM
 * @introduction :
 */
public class LISeq {
    public int lonIncreaseSeq(int[] Arr){
        int result = 1;
        int[] dp = new int[Arr.length];
        dp[0] = 1;
        for (int i = 1;i < Arr.length; i++){
            for (int j = 0 ;j < i ;j++){
                if (Arr[i] >= Arr[j] && dp[j] + 1 > dp[i]){
                    dp[i] = dp[j] + 1;
                }
            }
            result = Math.max(result, dp[i]);
        }
        return result;
    }
}
