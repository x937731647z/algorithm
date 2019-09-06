package com.zju.cst.leetcode;

import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wulixz
 * @date 9/6/19 : 11:36 AM
 * @introduction :Given an array nums of n integers,
 * are there elements a, b, c in nums such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 */
public class ThreeSumStandard {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        //对数组 nums进行排序
        //第一个元素一定小于0
        //指定第一个元素， 第二个元素从第一个元素的下面一个开始
        //第三个元素从最后一个元素开始
        if (nums.length < 3)return result;
        Arrays.sort(nums);
        if (nums[0] > 0) return  result;
        int index= 0;
        while (index < nums.length - 2){
            int second = index + 1;
            int third = nums.length -1 ;
            while (second < third){
                int sum = nums[index] + nums[second] + nums[third];
                if (sum == 0)result.add(Arrays.asList(nums[index],nums[second],nums[third]));
                if (sum <= 0) while (nums[second] == nums[++second] && second < third);//第二个数向右移,跳过重复的值
                if (sum >= 0) while (nums[third--] == nums[third] && second < third);//第三个数向左移,跳过重复的值
            }
            while (nums[index] == nums[ ++ index] && index < nums.length-2);
        }
        return result;
    }
}
