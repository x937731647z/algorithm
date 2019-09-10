package com.zju.cst.algorithm_note;

/**
 * @author wulixz
 * @date 9/8/19 : 6:28 PM
 * @introduction :
 */
public class LarSubArrSum {
    public int subArrSum(int[] Arr){
        int result =Arr[0];
        int[] dp = new int[Arr.length];
        dp[0] = Arr[0];
        for (int i = 1 ; i < Arr.length ; i ++){
            // Arr[i] 是目前的这个数字
            // dp[i]是当前为止 最大的子序列和。
            // 所以 状态方程  是：
            // 比较 （Arr[i] 当前这个数字， 和， Arr[i] 当前这个数字 + 之前最大值）之间的最大值，
            dp[i] = Math.max(Arr[i], dp[i-1]+ Arr[i]);
        }
        for (int num : dp){
            result = Math.max(result,num);
        }
        return result;
    }
}
