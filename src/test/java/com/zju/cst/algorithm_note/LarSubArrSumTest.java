package com.zju.cst.algorithm_note;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LarSubArrSumTest {
    LarSubArrSum subSum;
    @Before
    public void setUp() throws Exception {
        subSum = new LarSubArrSum();
    }

    @Test
    public void subArrSum() {
        int[] arr = {-2, 11, -4, 13,-5,-2};
        int result = 20;
        assertEquals(result,subSum.subArrSum(arr));
    }
}