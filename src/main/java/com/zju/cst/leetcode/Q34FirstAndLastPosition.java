package com.zju.cst.leetcode;

import java.util.Arrays;

/**
 * @author wulixz
 * @date 2/20/20 : 11:54 AM
 * @introduction :
 */
public class Q34FirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0)return new int[]{-1, -1};
        int index = -1;
        int lastindex = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            if (nums[left] == target){
                index = left;
                while (nums[right] != target && left<=right){
                    right --;
                }
                if (nums[right] == target){
                    lastindex = right;
                }
                break;
            }else {
                left ++;
            }
        }
        int[] result = {index,lastindex};
        return result;
    }
}

class Q34TestFitstAndLastPosition{
    public static void main(String[] args) {
        Q34FirstAndLastPosition falp = new Q34FirstAndLastPosition();
        int[] nums  = {5,7,7,8,8,10};
        int target = 5;
        int[] result =falp.searchRange(nums,target);
        System.out.println(Arrays.toString(result));
    }
}