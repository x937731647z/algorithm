package com.zju.cst.leetcode;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wulixz
 * @date 1/23/20 : 4:51 PM
 * @introduction :
 */
public class Q3NoRepeatChar {
    // a b c a b c b b  3
    // p w w k e w 3
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int length = s.length();
        int i = 0, j = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (; j < length; ++j) {
            if (hashMap.containsKey(s.charAt(j))) {
                i = Math.max(hashMap.get(s.charAt(j)) + 1, i);
            }
            maxLength = Math.max(maxLength, j - i + 1);
            hashMap.put(s.charAt(j), j);
        }
        return maxLength;
    }
}
