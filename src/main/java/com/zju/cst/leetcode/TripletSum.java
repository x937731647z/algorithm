package com.zju.cst.leetcode;

import java.util.*;

/**
 * @author wulixz
 * @date 9/5/19 : 7:31 PM
 * @introduction :Given an array nums of n integers,
 *                are there elements a, b, c in nums such that a + b + c = 0?
 *                Find all unique triplets in the array which gives the sum of zero.
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 *
 * A solution set is:
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 */
public class TripletSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> allList = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i ++){
        }

        return allList;






    }
    //确定第一个数，
    //确定第二个数
    //确定第三个数

    //1 确定边界条件
    //2 选择分岔路
//    public List<Integer> dfsTriple(int first, int second,int third, int[] nums ){
//        if (third == nums.length){
//            return ;
//        }
//        //第三个不选
//        dfsTriple(first,second,third + 1,nums);
//
//        dfsTriple(first,second + 1,third + 1,nums);
//        if (nums[first] + nums[second] == 0){
//            dfsTriple(first + 1,second + 1,nums);
//        }
//
//    }
}
