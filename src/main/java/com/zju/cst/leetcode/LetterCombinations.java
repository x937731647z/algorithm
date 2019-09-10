package com.zju.cst.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wulixz
 * @date 9/8/19 : 1:01 AM
 * @introduction :Given a string containing digits from 2-9 inclusive,
 * return all possible letter combinations that the number could represent.
 *
 */
public class LetterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<String>();
        if(!digits.isEmpty()) {
            helper(digits, "", 0, list);
        }
        return list;
    }
    public void helper(String digits, String combo, int position, List<String> list) {
        if(position == digits.length()) {
            list.add(combo);
            return;
        }
        String[] letters = getMapping(digits.charAt(position));
        for(int i = 0; i < letters.length; i++){
            helper(digits, combo + letters[i], position + 1, list);
        }
    }

    public String[] getMapping(char c) {
        switch (c) {
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
