package com.zju.cst.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wulixz
 * @date 9/10/19 : 11:29 AM
 * @introduction :Given an array nums of n integers and an integer target,
 * are there elements a, b, c, and d in nums such that a + b + c + d = target?
 * Find all unique quadruplets in the array which gives the sum of target.
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        if (nums.length < 4)return list;
        Arrays.sort(nums);
        int index = 0;
        while (index < nums.length -3){
            int second = index + 1;
                while (second < nums.length - 2){
                    int third = second + 1;
                    while (third < nums.length -1){
                        int forth = nums.length -1;{
                            while (forth > third){
                                int sum = nums[index] + nums[second] + nums[third] + nums[forth];
                                if (sum == target) {
                                    if (!list.contains(Arrays.
                                            asList(nums[index],nums[second],nums[third],nums[forth])))
                                    {list.add(Arrays.
                                            asList(nums[index],nums[second],nums[third],nums[forth]));}
                                }
                                if (sum <= target) {
                                    third++;
                                }
                                else {
                                    forth--;
                                }
                            }
                            third++;
                        }
                    }
                    second ++;
                }
                index ++;
        }
        return list;
    }
}
