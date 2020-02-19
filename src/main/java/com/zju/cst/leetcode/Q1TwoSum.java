package com.zju.cst.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wulixz
 * @date 1/23/20 : 3:16 PM
 * @introduction :
 */
public class Q1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int [] res = null;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i ++){
            int val = target - nums[i];
            if (map.containsKey(val)){
                return new int[]{i,map.get(val)};
            }
            map.put(nums[i],i);
        }
        return res;
    }
}
