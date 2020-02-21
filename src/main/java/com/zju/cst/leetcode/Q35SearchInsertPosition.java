package com.zju.cst.leetcode;

/**
 * @author wulixz
 * @date 2/20/20 : 12:13 PM
 * @introduction :
 */
public class Q35SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int result = 0;
        if (nums.length == 0){
            return result;
        }
        int index = 0;
        if (target <= nums[0]) return 0;
        if (target > nums[nums.length -1 ])return nums.length;
        while (index < nums.length){
            if (target == nums[index]) {
                result = index;
                break;
            }else if (target > nums[index] && target < nums[index + 1]){
                result = index + 1;
                break;
            }
            index ++;
        }
        return result;
    }
}

class Q35TestSearchInsertPosition{
    public static void main(String[] args) {
        Q35SearchInsertPosition sip = new Q35SearchInsertPosition();
        int[] nums = {1,3,5,6};
        int tar = 7;
        System.out.println(sip.searchInsert(nums,tar));
    }
}