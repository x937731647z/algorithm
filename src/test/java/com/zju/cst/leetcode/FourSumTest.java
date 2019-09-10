package com.zju.cst.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FourSumTest {
    FourSum fourSum;

    @Before
    public void setUp() throws Exception {
        fourSum = new FourSum();
    }

    @Test
    public void fourSum() {
        int [] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(-2,-1,1,2));
        list.add(Arrays.asList(-2,0,0,2));
        list.add(Arrays.asList(-1,0,0,1));
        assertEquals(list,fourSum.fourSum(nums,target));

    }
    @Test
    public void fourSum2() {
        int [] nums = {-3,-2,-1,0,0,1,2,3};
        int target = 0;
        List<List<Integer>> list = new ArrayList<>();
//        list.add(Arrays.asList(-1,0,0,1));
//        list.add(Arrays.asList(-2,-1,1,2));
//        list.add(Arrays.asList(-2,0,0,2));
        assertEquals(list,fourSum.fourSum(nums,target));

    }
}