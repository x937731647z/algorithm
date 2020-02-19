package com.zju.cst.leetcode;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author wulixz
 * @date 9/24/19 : 5:16 PM
 * @introduction :
 */
public class Review {
    public boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        Stack<Character> stack = new Stack<>();
        for (Character c: s.toCharArray()) {
            if (map.containsKey(c)){
                stack.push(map.get(c));
            }else {
                if (stack.isEmpty() || c != stack.pop()){
                    return false;
                }
            }
        }
        if (!stack.isEmpty())return false;
        return true;
    }

}
