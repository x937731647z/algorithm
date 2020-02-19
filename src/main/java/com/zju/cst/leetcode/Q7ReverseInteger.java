package com.zju.cst.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author wulixz
 * @date 1/27/20 : 3:31 PM
 * @introduction :
 */
public class Q7ReverseInteger {
    public int reverse(int x) {
        int res = Math.abs(x);
        long result = 0;
        int sign = x >= 0 ? 0 : 1 ;
        Stack<Integer> queue =new Stack<>();
        while (res > 0){
            int last = res % 10;
            res /= 10;
            queue.push(last);
        }
        int dig = 0;
        while (!queue.isEmpty()){
             result += queue.pop() * Math.pow(10,dig);
            dig ++;
        }
        int value = 0;
        if (result > Integer.MAX_VALUE)return value;
        return value = (int)(sign == 1 ? 0 - result : result);
    }
}
