package com.zju.cst.leetcode;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * @author wulixz
 * @date 1/27/20 : 10:38 AM
 * @introduction :
 */
public class Q4MedianofArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        //compare that the first number of each array is smaller
        int[] newArr = new int[len1 + len2];
        for (int i = 0; i < newArr.length ;i ++){
            if (i <len1){
                newArr[i] = nums1[i];
            }else {
                newArr[i] = nums2[i - len1];
            }
        }
        Arrays.sort(newArr);
        DecimalFormat df = new DecimalFormat("0.00000");
        if (newArr.length % 2 ==0){
            int tmp = newArr[newArr.length/2 - 1] + newArr[newArr.length / 2];
            result = (double) tmp / 2;
        }else {
            result = newArr[newArr.length / 2];
        }
        return result;
    }
}
