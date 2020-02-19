package com.zju.cst.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q8AtoiTest {

    Q8Atoi q8Atoi;
    @Before
    public void setUp() throws Exception {
        q8Atoi = new Q8Atoi();
    }

    @Test
    public void myAtoi() {
        String input = "20000000000000000000";
        int out = -4193;
        assertEquals(out, q8Atoi.myAtoi(input));
    }
}