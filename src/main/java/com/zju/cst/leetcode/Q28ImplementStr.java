package com.zju.cst.leetcode;

/**
 * @author wulixz
 * @date 1/31/20 : 3:50 PM
 * @introduction :
 */
public class Q28ImplementStr {
    public static void main(String[] args) {
        Q28ImplementStr is = new Q28ImplementStr();
        String haystack = "hello";
        String needle = "ll";
        int res =  is.strStr(haystack,needle);
        System.out.println(res);
    }

    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) return -1;
        char[] cn = needle.toCharArray();
        if (cn.length == 0)
            return 0;
        char[] ch = haystack.toCharArray();
        for (int i = 0; i < ch.length - cn.length + 1; ++i) {
            for (int j = 0; j < cn.length; ++j) {
                if (ch[i + j] != cn[j]) break;
                else if (j == cn.length - 1)
                    return i;
            }
        }
        return -1;
    }
}
