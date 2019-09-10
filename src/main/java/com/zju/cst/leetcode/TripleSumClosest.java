package com.zju.cst.leetcode;

import java.util.Arrays;

/**
 * @author wulixz
 * @date 9/7/19 : 11:27 PM
 * @introduction :
 */
public class TripleSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int result = 0;
        if (nums.length == 0)return result;
        if (nums.length <= 3){
            for (int n:nums
                 ) {
                result += n;
            }
            return result;
        }
        int index = 0;
        int beginSum = nums[0] + nums[1] + nums[2];
        int begin = Math.abs( beginSum - target);
        while (index < nums.length - 2){
            int second = index + 1;
            while ( second < nums.length -1){
                int third = nums.length - 1;
                while (second < third ){
                    int sum = nums[index] + nums[second] + nums[third];
                    int abs = Math.abs(sum - target);
                    if (abs <= begin){
                        result = sum;
                        begin = abs;
                    }
                    while (nums[third--] == nums[third] && third > second);
                }
                while (nums[second ++] == nums[second] &&  second <third);
            }
            index ++;
        }
        return result;
    }
}
