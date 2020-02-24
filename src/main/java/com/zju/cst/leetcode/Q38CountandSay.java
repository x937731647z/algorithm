package com.zju.cst.leetcode;

/**
 * @auther wulixz
 * @date 2020/2/22 7:33
 * @level
 * @desc
 * @example
 * @solution
 * @standard
 */
public class Q38CountandSay {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        return countAndSay(countAndSay(n - 1));
    }

    public String countAndSay(String str) {
        StringBuilder sb = new StringBuilder();
        char[] cs = str.toCharArray();
        int i = 0, j = 0;
        for (; i < cs.length; i = j) {
            char cur = cs[i];
            j = i + 1;
            while (j < cs.length && cur == cs[j]) {
                ++j;
            }
            sb.append(j - i);
            sb.append(cur);
        }
        return sb.toString();
    }
}

class Q38TestCountandSay{
    public static void main(String[] args) {
        Q38CountandSay CaS = new Q38CountandSay();
        String res = CaS.countAndSay(30);
        System.out.println(res);
    }
}