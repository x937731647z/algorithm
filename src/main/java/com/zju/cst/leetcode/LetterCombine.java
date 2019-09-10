package com.zju.cst.leetcode;


import java.util.ArrayList;
import java.util.List;

/**
 * @author wulixz
 * @date 9/10/19 : 10:25 AM
 * @introduction :
 */
public class LetterCombine {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (!digits.isEmpty()){
            helper(digits,"",0,list);
        }
        return list;
    }
    public void helper(String digits, String str, int positon, List<String> list){
        if (positon == digits.length()){
            list.add(str);
            return;
        }
        String[] letter = getArray(digits.charAt(positon));
        for (int i = 0; i < letter.length; i ++){
            helper(digits,str+letter[i],positon + 1,list);
        }

    }
    public String[] getArray(char character){
        switch (character){
            case '2':
                return new String[]{"a", "b", "c"};
            case '3':
                return new String[]{"d", "e", "f"};
            case '4':
                return new String[]{"g", "h", "i"};
            case '5':
                return new String[]{"j", "k", "l"};
            case '6':
                return new String[]{"m", "n", "o"};
            case '7':
                return new String[]{"p", "q", "r", "s"};
            case '8':
                return new String[]{"t", "u", "v"};
            case '9':
                return new String[]{"w", "x", "y", "z"};
        }
        return new String[]{};
    }
}
