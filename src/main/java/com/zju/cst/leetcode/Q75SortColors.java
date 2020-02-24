package com.zju.cst.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther wulixz
 * @date 2020/2/24 8:35
 * @level  Medium
 * @desc Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 *     Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 * @example           Input: [2,0,2,1,1,0]
 *                     Output: [0,0,1,1,2,2]
 * @solution
 * @standard
 */
public class Q75SortColors {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int n : nums){
            hashMap.put(n,hashMap.getOrDefault(n,0) + 1);
        }
        int index = 0;
        for (Map.Entry<Integer,Integer> entry : hashMap.entrySet()){
            for (int i = 0 ; i < entry.getValue(); i ++){
                nums[index] = entry.getKey();
                index ++;
            }
        }
    }
}
class Q75TestSortColors{
    public static void main(String[] args) {
        Q75SortColors Sort = new Q75SortColors();
        int [] nums = {2,0,2,1,1,0};
        Sort.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}