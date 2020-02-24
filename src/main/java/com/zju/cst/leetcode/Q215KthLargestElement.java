package com.zju.cst.leetcode;

import java.util.Arrays;

/**
 * @auther wulixz
 * @date 2020/2/24 5:35
 * @level  Medium
 * @desc  Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * @example
 * @solution
 * @standard  use Arrays.sort()
 */
public class Q215KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        if (k > nums.length || nums.length ==0) return 0;
        int length = nums.length;
        for (int i = 0 ; i < k ; i ++){
            GreatHeap(nums,length - i);
        }
        return nums[length - k];
    }
    private void GreatHeap(int[] nums,int length){
        int len = length;
        int begin =  len / 2 - 1;
        for (int i =  begin ; i >= 0 ; i -- ){
            int compare = nums[2 * i + 1];
            int temp = 2 * i + 1;
            if (2 * i + 2 <= len - 1){
                int num2 = nums[2 * i + 2 ];
                if (num2 > compare){
                    compare = num2;
                    temp = 2 * i + 2;
                }
            }
            if (nums[i] <compare){
                nums[temp] = nums[i];
                nums[i] = compare;
            }
        }
        int tmp = nums[0];
        nums[0] = nums[length -1];
        nums[length -1] = tmp;
    }
}
class Q215TestKthLargestElement{
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        Q215KthLargestElement KLE = new Q215KthLargestElement();
        int res = KLE.findKthLargest(nums,2);
        System.out.println(res);
    }
}

