package com.zju.cst.leetcode;

import java.util.Arrays;

/**
 * @auther wulixz
 * @date 2020/2/20 7:04
 */
public class zTemporary {
    public static void main(String[] args) {
        int [] arrs = {2, 3, 1};
        zTemporary zt = new zTemporary();
        zt.nextPermutation(arrs);
        System.out.println(Arrays.toString(arrs));
    }

    public void nextPermutation(int [] nums){
        int i ;
        for ( i = nums.length -1; i > 0 ; i--){
            if (nums[i] > nums[i - 1]){
                break;
            }
        }
        // right now you can get i and i - j
        // which nums[i - 1] < nums[i]
        // make a swap
        if (i > 0){
            for (int j  = nums.length - 1; j > i - 1; j --){
                if (nums[j] > nums[i - 1]){
                    swap(nums,j, i -1);
                    break;
                }
            }
        }
        // do a reverse
        reverse(nums,i,nums.length - 1);
    }

    public void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void reverse(int[] arr, int i, int j){
        while (i  < j){
            swap(arr,i ++,j--);
        }
    }
}
