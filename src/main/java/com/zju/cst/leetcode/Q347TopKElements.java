package com.zju.cst.leetcode;

import java.util.*;

/**
 * @auther wulixz
 * @date 2020/2/24 6:32
 * @level  Medium
 * @desc  Given a non-empty array of integers, return the k most frequent elements.
 * @example     Input: nums = [1,1,1,2,2,3], k = 2
 *               Output: [1,2]
 * @solution
 * @standard
 */
public class Q347TopKElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int time = 0 ; time < nums.length ; time++){
            if (hashMap.containsKey(nums[time])){
                int value = hashMap.get(nums[time]) + 1;
                hashMap.put(nums[time], value );
            }else {
                hashMap.put(nums[time],0);
            }
        }
        ArrayList<Map.Entry<Integer, Integer>> entries = new ArrayList<>(hashMap.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
//              return o2.getValue() - o1.getValue();
            }
        });
        for (int i = 0 ; i < k ; i ++){
            res.add(entries.get(i).getKey());
            System.out.println(entries.get(i).getKey());
        }
        return res;
    }
}

class Q347TestTopKElements{
    public static void main(String[] args) {
        Q347TopKElements TopK = new Q347TopKElements();
        int[] arr = {1,1,1,2,2,3};
        TopK.topKFrequent(arr,2);
    }
}