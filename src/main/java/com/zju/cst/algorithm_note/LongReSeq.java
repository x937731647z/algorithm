package com.zju.cst.algorithm_note;

/**
 * @author wulixz
 * @date 1/19/20 : 4:06 PM
 * @introduction :
 */
public class LongReSeq {
    public int longReSeq(String Arr){
        int result = 1;
        int len = Arr.length();
        char[] charArr = Arr.toCharArray();
        int[][] dp = new int[len][len];
        for (int i = 0 ;i < len - 1; i ++){
            dp[i][i] = 1;
            if (charArr[i] ==  charArr[i +1]){
                dp[i][i+1] = 1;
                result = 2;
            }
        }


        for (int Length = 3; Length < len ; Length ++){
            for (int i = 0; i + Length - 1 < len; i ++){
                int j = i + Length -1;
                if (charArr[i] == charArr[j] && dp[i+1][j-1] == 1){
                    dp[i][j] = 1;
                    result = Length;
                }
            }
        }
        return result;
    }
}
