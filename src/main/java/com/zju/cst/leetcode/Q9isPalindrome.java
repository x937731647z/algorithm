package com.zju.cst.leetcode;

/**
 * @author wulixz
 * @date 1/27/20 : 4:30 PM
 * @introduction :
 */
public class Q9isPalindrome {
    public boolean isPalindrome(int x) {
        if (x < 0 ) return false;
        int orign = x;
        int newResult = 0;
        while (x  > 0 ){
            int tail =  x % 10;
            newResult  = newResult * 10 + tail;
            x /=  10;
        }
        if (orign == newResult)return true;
        return false;
    }
}
