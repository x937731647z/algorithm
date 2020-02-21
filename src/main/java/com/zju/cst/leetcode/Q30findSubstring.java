package com.zju.cst.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @auther wulixz
 * @date 2020/2/20 7:37
 * @level hard
 * @desc You are given a string, s, and a list of words, words,
 * that are all of the same length. Find all starting indices of substring(s)
 * in s that is a concatenation of each word in words exactly once and without any intervening characters.
 * @example String s = "wordgoodgoodgoodbestword";
 * String [] words = {"word","good","best","good"};
 * @solution store the words array into Hashmap and clone one(putAll fuction) for using
 * Traverse the s source by 'four' char once, if found, remove one from the map until map become none
 * store the index to the res List
 */
public class Q30findSubstring {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        if (s.length() == 0 || words.length == 0) {
            return res;
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            int num = 1;
            if (map.containsKey(word)) {
                num = map.get(word) + 1;
            }
            map.put(word, num);
        }
        int slen = s.length();
        int wordlen = words[0].length();
        int index = 0;
        int sum = wordlen * words.length;
        while (index <= slen - sum) {
            HashMap<String, Integer> clone = new HashMap<>();
            clone.putAll(map);
            int i = index;
            while (i <= slen - wordlen) {
                String sub = s.substring(i, i + wordlen);
                if (clone.containsKey(sub)) {
                    int value = clone.get(sub);
                    if (value > 1) {
                        clone.put(sub, --value);
                    } else {
                        clone.remove(sub);
                    }
                } else {
                    break;
                }
                if (clone.size() == 0) {
                    res.add(index);
                    break;
                }
                i += wordlen;
            }
            index++;
        }
        return res;
    }
}

class Q30TestfindSubstring {
    public static void main(String[] args) {
        Q30findSubstring sub = new Q30findSubstring();
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word", "good", "best", "good"};
        List<Integer> res;
        res = sub.findSubstring(s, words);
        System.out.println(res);

    }
}