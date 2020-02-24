package com.zju.cst.leetcode;

import java.util.Arrays;

/**
 * @auther wulixz
 * @date 2020/2/23 9:03
 * @level Easy
 * @desc  Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * @example
 * @solution
 * @standard To see Q88MergeSortedArrayStandard
 */
public class Q88MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n ==0){
            return ;
        }
        int[] numsMerge = new int[m + n];
        if (m == 0){
            numsMerge = nums2;
        }
        int index = 0;
        int indexF = 0;
        int indexS = 0;
        while (indexF < m  &&  indexS< n){
            if (nums1[indexF] <= nums2[indexS] ){
                numsMerge[index] = nums1[indexF];
                indexF ++;
            }else {
                numsMerge[index] = nums2[indexS];
                indexS ++;
            }
            index ++;

            if (indexF == m){
                for (int i = indexS; i < n; i ++){
                    numsMerge[index ++ ] = nums2[i];
                }
            }
            if (indexS == n){
                for (int i = indexF; i < m; i ++){
                    numsMerge[index ++ ] = nums1[i];
                }
            }
        }
        for (int i = 0 ; i < numsMerge.length; i ++){
            nums1[i] = numsMerge[i];
        }

    }
}

class Q88TestMergeSortedArray{
    public static void main(String[] args) {
        Q88MergeSortedArray Merge = new  Q88MergeSortedArray();
        int [] nums1= {0};
        int [] nums2 = {1};
        Merge.merge(nums1,0,nums2,1);
        System.out.println(Arrays.toString(nums1));
    }
}