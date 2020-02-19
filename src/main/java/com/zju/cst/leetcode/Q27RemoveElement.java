package com.zju.cst.leetcode;

import java.util.Arrays;

/**
 * @author wulixz
 * @date 1/31/20 : 2:46 PM
 * @introduction :
 */
public class Q27RemoveElement {
    public static void main(String[] args) {
        Q27RemoveElement re = new Q27RemoveElement();
        int[] nums = {3,2,2,3};
        re.removeElement(nums,3);
    }
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0)
            return 0;
        int right = nums.length - 1;
        for (int i = 0 ; i <= right; i ++){
            if (nums[i] == val){
                while (nums[right] == val && i <right){
                    right --;
                    if (right <=0){
                        nums = null;
                        return 0;
                    }
                }
                    int tmp = nums[i];
                    nums[i] = nums[right];
                    nums[right] = tmp;
                    right --;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(right + 1);
        return right + 1;
}
}
