package com.zju.cst.leetcode;

import java.util.*;

/**
 * @auther wulixz
 * @date 2020/2/24 7:24
 * @level medium
 * @desc Given a string, sort it in decreasing order based on the frequency of characters.
 * @example Input:
 * "tree"
 * Output:
 * "eert"
 * Explanation:
 * 'e' appears twice while 'r' and 't' both appear once.
 * So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
 * @solution
 * @standard
 */
public class Q451SortCharactersFrequency {
    public String frequencySort(String s) {
        String str = "";
        int len = s.length();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < len ; i++) {
            char chars = s.charAt(i);
            int count = 0;
            if (hashMap.containsKey(chars)) {
                count = hashMap.get(chars) + 1;
            }
            hashMap.put(chars, count);
        }
        ArrayList<Map.Entry<Character, Integer>> entries = new ArrayList<>(hashMap.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        for (Map.Entry<Character, Integer> entry: entries) {
            for (int i = 0; i <= entry.getValue(); i ++){
                str += entry.getKey();
            }
        }
        return str;
    }
}

class Q451TestSortCharactersFrequency{
    public static void main(String[] args) {
        Q451SortCharactersFrequency SortChar = new Q451SortCharactersFrequency();
        String str = "";
        String res = SortChar.frequencySort(str);
        System.out.println(res);
    }
}