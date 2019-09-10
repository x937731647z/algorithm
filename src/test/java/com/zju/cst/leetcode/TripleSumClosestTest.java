package com.zju.cst.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TripleSumClosestTest {
    TripleSumClosest sumClosest;

    @Before
    public void setUp() throws Exception {
        sumClosest = new TripleSumClosest();
    }

    @Test
    public void threeSumClosest() {
        int[] nums = {-1,2,1,-4};
        int target = 1;
        int result = 2;
        assertEquals(result , sumClosest.threeSumClosest(nums, target));
    }
    @Test
    public void threeSumClosestSecond() {
        int[] nums = {1,1,-1,-1,3};
        int target = -1;
        int result = -1;
        assertEquals(result , sumClosest.threeSumClosest(nums, target));
    }
    @Test
    public void threeSumClosestThrid() {
        int[] nums = {-1, 2, 1,-4};
        int target = 1;
        int result = 2;
        assertEquals(result , sumClosest.threeSumClosest(nums, target));
    }
}