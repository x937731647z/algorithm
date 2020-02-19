package com.zju.cst.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author wulixz
 * @date 9/23/19 : 10:37 AM
 * @introduction :
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character,Character> pM = new HashMap<>();
        pM.put('(', ')');
        pM.put('{', '}');
        pM.put('[', ']');
        Stack<Character> pS = new Stack<>();
        for(Character c: s.toCharArray()) {
            if(pM.containsKey(c)) {
                pS.push(pM.get(c));
            } else {
                if(pS.isEmpty() || c != pS.pop())
                    return false;
            } }
        if(!pS.isEmpty()) return false;
        return true;
    }
}

