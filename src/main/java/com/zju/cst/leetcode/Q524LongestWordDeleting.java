package com.zju.cst.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther wulixz
 * @date 2020/2/24 3:24
 * @level Medium
 * @desc   Given a string and a string dictionary, find the longest string in the dictionary that can be formed by deleting some characters of the given string.
 *         If there are more than one possible results, return the longest word with the smallest lexicographical order. If there is no possible result, return the empty string.
 * @example Input:
 *              s = "abpcplea", d = ["ale","apple","monkey","plea"]
 *          Output:
 *              "apple
 * @solution
 * @standard
 */
public class Q524LongestWordDeleting {
    public String findLongestWord(String s, List<String> d) {
        int len = -1;
        int index = 0;
        int postion = 0;
        for (String res : d){
            int value =  findLongestWord(s,res);
            if (len < value){
                len = value;
                postion = index;
            }
            if (len == value){
                if ( d.get(postion).compareTo(d.get(index)) > 0){
                    postion = index;
                }
            }
            index ++;
        }
        if (len == -1)return "";
        return d.get(postion);

    }
    private int findLongestWord(String s, String sub){
        int subLen = sub.length();
        int sLen = s.length();
        int subIndex = 0;
        int sIndex = 0;
        while (subIndex < subLen && sIndex < sLen){
            if (sub.charAt(subIndex) == s.charAt(sIndex)){
                subIndex ++;
                sIndex ++;
            }else {
                sIndex ++;
            }

            if (subIndex == subLen) return subLen;
        }
        return  -1;
    }
}

class Q524TestLongestWordDeleting{
    public static void main(String[] args) {
        String apple = "apple";
        String one = "zxc";
        String sec = "vpn";
        List<String> list =new ArrayList<>();
        list.add(one);
        list.add(sec);
        Q524LongestWordDeleting LWD = new Q524LongestWordDeleting();
        String res = LWD.findLongestWord(apple,list);
        System.out.println(res);
     }
}