package com.zju.cst.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wulixz
 * @date 9/5/19 : 9:30 AM
 * @introduction :
 */
public class RomanToInteger {
    public int rotoInte(String s){
        //异常情况， 非数字罗马字母 或者 空字符
        //return 0;
        //列出 罗马字母原则
        String[] RomanList = {"M", "CM", "D", "CD", "C","XC","L","XL",   "X", "IX","V",  "IV", "I"};
        int[] NumList = {1000,  900, 500, 400, 100, 90, 50, 40,10, 9 ,5, 4, 1};
        HashMap<String,Integer>  hashMap = new HashMap<>();
        for (int i = 0 ; i < RomanList.length; i ++){
            hashMap.put(RomanList[i],NumList[i]);
        }

        //设置返回值
        int result = 0;
        //分割字符串， 依次对字符进行判断
        char[] RomanChar = s.toCharArray();
        //设置当前字符与下一个字符
        String nowChar = "";
        String nextChar ="" ;
        if (RomanChar.length == 1){
            return hashMap.get(RomanChar[0]+"");
        }
        for (int i = 0 ;i < RomanChar.length ; i ++){
            nowChar = RomanChar[i] + "";
            if (i < RomanChar.length - 1)
            {
                nextChar = RomanChar[i +1 ] + "";
                if (hashMap.containsKey(nowChar) && hashMap.containsKey(nextChar)){
                    if (hashMap.get(nowChar) < hashMap.get(nextChar)){
                        nowChar = nowChar + nextChar;
                        i++;
                    }
                }else {
                    return 0;
                }

            }
            result = hashMap.get(nowChar) + result;
        }

        return result;


    }
}
