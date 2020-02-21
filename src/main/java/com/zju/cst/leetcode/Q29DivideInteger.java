package com.zju.cst.leetcode;

/**
 * @auther wulixz
 * @date 2020/2/17 5:08
 */
public class Q29DivideInteger {
    public int divide(int dividend, int divisor) {
        boolean flag = true;
        long quotient = 0;
        if ((dividend < 0  && divisor > 0 ) || (dividend >0 && divisor < 0 )){
            flag = false;
        }
        long newdividend = dividend;
        if (newdividend < 0 )
        newdividend =  0 - newdividend;
        if (divisor < 0){
            divisor = 0 - divisor;
        }
        if (newdividend < divisor) return 0;
        else {
            while (newdividend - divisor >= 0){
                quotient ++;
                newdividend -= divisor;
            }
        }
        if (!flag) {
            quotient = 0 - quotient;
        };
        int newquotient = quotient >Integer.MAX_VALUE || quotient< Integer.MIN_VALUE ? Integer.MAX_VALUE : (int)quotient;
        return newquotient;
    }
}

class Q29TestDivideInteger {
    public static void main(String[] args){
        Q29DivideInteger di = new Q29DivideInteger();
        int quotient =  di.divide(
                -2147483648,1);
        System.out.println(quotient);
    }
}