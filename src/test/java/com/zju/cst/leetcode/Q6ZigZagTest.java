package com.zju.cst.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q6ZigZagTest {

    Q6ZigZag zig ;
    @Before
    public void setUp() throws Exception {
        zig = new Q6ZigZag();
    }

    @Test
    public void convert() {
        String str = "PAYPALISHIRING";
        String res = "PAHNAPLSIIGYIR";
        int numRows = 3;
        assertEquals(res, zig.convert(str,numRows));
    }
}