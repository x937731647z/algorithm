package com.zju.cst.leetcode;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @auther wulixz
 * @date 2020/2/23 8:19
 * @level
 * @desc
 * @example
 * @solution
 * @standard
 */
public class Q345ReverseVowel {
    private static final HashSet<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() -1;
        char[] chars = s.toCharArray();
        while (left < right){
            char l = chars[left];
            char r = chars[right];
            if (!set.contains(chars[left])){
               left ++;
            }else if (!set.contains(chars[right])){
               right--;
            }else {
                chars[left ++] = r;
                chars[right --] = l;
            }
        }
        return new String(chars);
    }
}
class Q345TestReverseVowel{
    public static void main(String[] args) {
        Q345ReverseVowel Reverse = new Q345ReverseVowel();
        String str = "hello";
        String newStr = Reverse.reverseVowels(str);
        System.out.println(newStr);
    }

}