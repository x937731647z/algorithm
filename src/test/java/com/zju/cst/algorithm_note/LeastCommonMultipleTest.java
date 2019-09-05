package com.zju.cst.algorithm_note;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeastCommonMultipleTest {

    LeastCommonMultiple leastCommonMultiple;

    @Before
    public void setLeastCommonMultiple(){
        leastCommonMultiple = new LeastCommonMultiple();
    }
    @Test
    public void leastComMultiple() {
        int result = 12;
        int a = 4, b = 6;
        assertEquals(result,leastCommonMultiple.leastComMultiple(a,b));
    }
}