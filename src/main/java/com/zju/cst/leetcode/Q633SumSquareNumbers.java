package com.zju.cst.leetcode;

/**
 * @auther wulixz
 * @date 2020/2/23 7:46
 * @level  Easy
 * @desc  Given a non-negative integer c, your task is to decide whether there're two integers a and b such that a2 + b2 = c.
 * @example
 * @solution
 * @standard
 */
public class Q633SumSquareNumbers {
    public boolean judgeSquareSum(int c) {
        if(c <0) return false;
        boolean res = false;
        int left = 0 ,right =(int) Math.sqrt(c);
        while (left <=  right){
            int temp = left * left + right * right;
            if (c == temp){
                return true;
            }
            else if (c <temp){
                right --;
            }
            else if (c >  temp){
                left ++;
            }
        }
        return res;
    }
}

class Q633TestSumSquareNumbers{
    public static void main(String[] args) {
        Q633SumSquareNumbers SumSquare = new Q633SumSquareNumbers();
        boolean res = SumSquare.judgeSquareSum(2);
        System.out.println(res);
    }
}
