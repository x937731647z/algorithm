package com.zju.cst.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q4MedianofArraysTest {
    Q4MedianofArrays median ;
    @Before
    public void setUp() throws Exception {
        median = new Q4MedianofArrays();
    }

    @Test
    public void findMedianSortedArrays() {
        double res = 2.5;
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        assertEquals(res,median.findMedianSortedArrays(nums1,nums2),0);

    }
}