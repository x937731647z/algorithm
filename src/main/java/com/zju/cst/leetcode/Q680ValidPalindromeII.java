package com.zju.cst.leetcode;

/**
 * @auther wulixz
 * @date 2020/2/23 8:38
 * @level Easy
 * @desc  Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.
 * @example
 * @solution
 * @standard
 */
public class Q680ValidPalindromeII {
    public boolean validPalindrome(String s) {
        boolean res = true;
        int len = s.length() - 1 ;
        for (int i = 0, j = len; i < j ; i ++, j --){
            if (s.charAt(i) != s.charAt(j)){
                return validPalindrome(s,i + 1,j) || validPalindrome(s,i,j - 1) ;
            }
        }
        return res;
    }
    public boolean validPalindrome(String s, int left , int right) {
        boolean res = true;
        for (int i = left, j = right; i < right; i ++, j--){
            if (s.charAt(i) != s.charAt(j))return false;
        }
        return res;
    }
}

class Q680TestValidPalindromeII{
    public static void main(String[] args) {
         Q680ValidPalindromeII Vaild = new Q680ValidPalindromeII();
        String  str = "mlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculm";
        boolean res = Vaild.validPalindrome(str);
        System.out.println(res);
    }
}
