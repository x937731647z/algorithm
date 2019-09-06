package com.zju.cst.leetcode;

/**
 * @author wulixz
 * @date 9/4/19 : 11:16 PM
 * @introduction :Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M
 */
public class IntegerToRoman {
    public String intoRoman(int num){
        if (num <= 0 )return "";
        String[] Roman = {"M", "CM", "D", "CD", "C","XC","L","  XL",   "X", "IX","V",  "IV", "I"};
        int[] numbers = {1000,  900, 500, 400, 100, 90, 50, 40,10, 9 ,5, 4, 1};
        String result = "";
        for (int i = 0 ; i <numbers.length; i ++){
            while ( num >= numbers[i]){
                num -= numbers[i];
                result = result + Roman[i];
            }
        }
        return result;
    }
}
