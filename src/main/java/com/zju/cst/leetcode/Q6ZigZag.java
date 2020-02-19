package com.zju.cst.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author wulixz
 * @date 1/27/20 : 2:13 PM
 * @introduction :
 */
public class Q6ZigZag {
    public String convert(String s, int numRows) {
        String str = "";
        if (numRows ==1)return s;
        int len = s.length();
        char[][] chars = new char[numRows][len];
        char[] S = s.toCharArray();
        int index = 0;
        boolean flag = true;
        int i = 0, j = 0;
        while (index < S.length){
            if (i>=0 && i< numRows){
                chars[i][j] = S[index];
            }
            if (flag){
                i++;
            }else {
                i--;
                j++;
            }
            if (i == numRows){
                flag = false;
                i -= 2;
                j ++;
            }
            if (i < 0){
                flag = true;
                i += 2;
                j --;
            }
            index ++;

            for (char[] c: chars
                 ) {
                System.out.println(Arrays.toString(c));
            }
            System.out.println("----------------------------");
        }


        for (int row = 0 ;  row < chars.length; row++){
            for (int colum = 0; colum < chars[0].length; colum ++){
                if (chars[row][colum] != '\0'){
//                    System.out.println(chars[row][colum]);
                    str = str +  chars[row][colum];
                }
            }
        }
        System.out.println(str);
        return str;
    }
}

