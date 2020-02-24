package com.zju.cst.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther wulixz
 * @date 2020/2/24 8:59
 * @level
 * @desc
 * @example
 * @solution
 * @standard
 */
public class Q75SortColorsBetter {
    public void sortColors(int[] nums) {
        int zero = -1, one = 0, two = nums.length;
        while (one < two) {
            if (nums[one] == 0) {
                swap(nums, ++zero, one++);
            } else if (nums[one] == 2) {
                swap(nums, --two, one);
            } else {
                ++one;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
class Q75TestSortColorsBetter{
    public static void main(String[] args) {
        Q75SortColorsBetter Sort = new Q75SortColorsBetter();
        int [] nums = {2,0,2,1,1,0};
        Sort.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}