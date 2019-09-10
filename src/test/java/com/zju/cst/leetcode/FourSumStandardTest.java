package com.zju.cst.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FourSumStandardTest {

    FourSumStandard fourSumStandard;
    @Before
    public void setUp() throws Exception {
    fourSumStandard = new FourSumStandard();
    }

    @Test
    public void fourSum() {
        int [] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(-2,-1,1,2));
        list.add(Arrays.asList(-2,0,0,2));
        list.add(Arrays.asList(-1,0,0,1));
        assertEquals(list,fourSumStandard.fourSum(nums,target));

    }
}