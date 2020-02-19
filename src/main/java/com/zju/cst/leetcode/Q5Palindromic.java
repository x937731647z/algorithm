package com.zju.cst.leetcode;

/**
 * @author wulixz
 * @date 1/27/20 : 11:09 AM
 * @introduction :
 */
public class Q5Palindromic {
    public String longestPalindrome(String s) {
        int strlen = s.length();
        String arr = strlen == 0 ?  "" : s.charAt(0) + "";
        char[] S = s.toCharArray();
        boolean[][] dp = new boolean[strlen][strlen];
        for (int i = 0 ; i < strlen ; i ++){
            dp[i][i] = true;
            if (i < strlen -1 ){
                if (S[i]==S[i+1]){
                    dp[i][i+1] = true;
                    arr =  s.substring(i,i + 2);
                }
            }

        }
        for (int L = 3; L <= strlen; L++ ){
            for (int left = 0; left + L -1 < strlen; left ++){
                int right = L + left - 1 ;
                System.out.println("when the L is  " + L +"  , the left is " + left + " , and the right is " + right);
                if (S[right] ==S[left] && dp[left+1][right -1]){
                    dp[left][right] = true;
                    arr =  s.substring(left,right + 1);
                }
            }
        }
        System.out.println(arr);
        return arr;

    }
}