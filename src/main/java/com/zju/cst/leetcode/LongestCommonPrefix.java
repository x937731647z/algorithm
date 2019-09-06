package com.zju.cst.leetcode;

/**
 * @author wulixz
 * @date 9/4/19 : 11:49 PM
 * @introduction :
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)return "";
        String prefix = "";

        char[] firstWord = strs[0].toCharArray();
        for (int i = 0; i < firstWord.length ; i ++){
            boolean flag = true;
          for (int j = 0; j < strs.length ; j ++){
                  if (i >= strs[j].length() || firstWord[i] != strs[j].charAt(i)){
                  flag = false;
                  break;
              }
          }
          if (flag == true){
              prefix += firstWord[i];
          }else break;

        }
        return prefix;
    }
}
