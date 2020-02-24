package com.zju.cst.leetcode;

import java.util.Arrays;

/**
 * @auther wulixz
 * @date 2020/2/23 9:43
 * @level
 * @desc
 * @example
 * @solution
 * @standard
 */
public class Q88MergeSortedArrayStandard {

    public static void main(String[] args) {
        Q88MergeSortedArrayStandard Merge = new  Q88MergeSortedArrayStandard();
        int [] nums1= {1,2,4,0,0,0};
        int [] nums2 = {2,3,6};
        Merge.merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1, index2 = n - 1;
        int indexMerge = m + n - 1;
        while (index1 >= 0 || index2 >= 0) {
            if (index1 < 0) {
                nums1[indexMerge--] = nums2[index2--];
            } else if (index2 < 0) {
                nums1[indexMerge--] = nums1[index1--];
            } else if (nums1[index1] > nums2[index2]) {
                nums1[indexMerge--] = nums1[index1--];
            } else {
                nums1[indexMerge--] = nums2[index2--];
            }
        }
    }
}
