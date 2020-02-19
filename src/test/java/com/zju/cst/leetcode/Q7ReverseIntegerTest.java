package com.zju.cst.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q7ReverseIntegerTest {

    Q7ReverseInteger ri ;

    @Before
    public void setUp() throws Exception {
        ri = new Q7ReverseInteger();
    }

    @Test
    public void reverse() {
        int input = 123;
        int out = 321;
        assertEquals(out,ri.reverse(input));
    }
    @Test
    public void reverseNegative() {
        int input = -123;
        int out = -321;
        assertEquals(out,ri.reverse(input));
    }
}