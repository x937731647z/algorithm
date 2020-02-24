package com.zju.cst.leetcode;

import java.util.HashMap;

/**
 * @auther wulixz
 * @date 2020/2/23 7:32
 * @level Easy
 * @desc Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 *
 *       The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 * @example
 * @solution
 * @standard  search from the begining  and the end.
 */
public class Q167TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null) return null;
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }
}
