package com.zju.cst.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ThreeSumStandardTest {

    ThreeSumStandard threeSumStandard;
    @Before
    public void setUp() throws Exception {
        threeSumStandard = new ThreeSumStandard();
    }

    @Test
    public void threeSum() {
        int[] input = {-1,0,1,2,-1,-4};
        List<List<Integer>> allList = new ArrayList<>();
        int[] line1 = {-1,-1,2};
        int[] line2 = {-1,0,1 };
        allList.add(Arrays.asList(line1[0], line1[1],line1[2]));
        allList.add(Arrays.asList(line2[0], line2[1],line2[2]));
        assertEquals(allList, threeSumStandard.threeSum(input));

    }
}