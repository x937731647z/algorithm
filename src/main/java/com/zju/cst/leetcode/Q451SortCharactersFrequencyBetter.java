package com.zju.cst.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @auther wulixz
 * @date 2020/2/24 7:54
 * @level
 * @desc
 * @example
 * @solution
 * @standard
 */
public class Q451SortCharactersFrequencyBetter {
    public String frequencySort(String s) {
        Map<Character, Integer> frequencyForNum = new HashMap<>();
        for (char c : s.toCharArray())
            frequencyForNum.put(c, frequencyForNum.getOrDefault(c, 0) + 1);

        for(Map.Entry<Character,Integer> v : frequencyForNum.entrySet()){
            System.out.println(v);
        }
        System.out.println("===============================");
        List<Character>[] frequencyBucket = new ArrayList[s.length() + 1];
        for (char c : frequencyForNum.keySet()) {
            int f = frequencyForNum.get(c);
            if (frequencyBucket[f] == null) {
                frequencyBucket[f] = new ArrayList<>();
            }
            System.out.println(c);
            frequencyBucket[f].add(c);
            System.out.println(frequencyBucket[f]);
            System.out.println("-------------------");
        }
        StringBuilder str = new StringBuilder();
        for (int i = frequencyBucket.length - 1; i >= 0; i--) {
            if (frequencyBucket[i] == null) {
                continue;
            }
            for (char c : frequencyBucket[i]) {
                for (int j = 0; j < i; j++) {
                    str.append(c);
                }
            }
        }
        return str.toString();
    }
}
class Q451TestSortCharactersFrequencyBetter{
    public static void main(String[] args) {
        Q451SortCharactersFrequencyBetter SortChar = new Q451SortCharactersFrequencyBetter();
        String str = "ftreefff";
        String res = SortChar.frequencySort(str);
        System.out.println(res);
    }
}