package com.zju.cst.leetcode;

import java.util.*;

/**
 * @auther wulixz
 * @date 2020/2/20 8:43
 * @level hard
 * @desc Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.
 * @example Input: "()(())"
 * Output: 6
 * @standard pay attention to the left, initialize left as -1
 */
public class Q32ValidParentheses {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int max = 0;
        int left = -1;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == '(') stack.push(j);
            else {
                if (stack.isEmpty()) left = j;
                else {
                    stack.pop();
                    if (stack.isEmpty()) max = Math.max(max, j - left);
                    else { max = Math.max(max, j - stack.peek()); }
                }
            }
        }
        return max;
    }
}

class Q32TestValidParentheses {
    public static void main(String[] args) {
        Q32ValidParentheses vp = new Q32ValidParentheses();
        String s = "()(()";
        int res = vp.longestValidParentheses(s);
        System.out.println(res);
    }
}