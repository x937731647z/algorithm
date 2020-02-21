package com.zju.cst.leetcode;

/**
 * @author wulixz
 * @date 2/20/20 : 11:43 AM
 * @introduction :
 */
public class Q33RotatedSortedArray {
    public static void main(String[] args) {
        Q33RotatedSortedArray rsa = new Q33RotatedSortedArray();
        int[] nums = {4,5,6,7,0,1,20};
        int tar = 0;
        int res =  rsa.search(nums,tar);
        System.out.println(res
        );
    }

    public int search(int[] nums, int target) {
        int result = -1;
        for(int i = 0 ; i <nums.length ; i ++){
            if (target == nums[i]){
                result = i;
                break;
            }
        }
        return result;
    }
}
