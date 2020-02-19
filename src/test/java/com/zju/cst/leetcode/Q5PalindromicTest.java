package com.zju.cst.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q5PalindromicTest {

    Q5Palindromic pa;

    @Before
    public void setUp() throws Exception {
        pa = new Q5Palindromic();
    }

    @Test
    public void longestPalindrome() {
        String str = "cbbd";
        String out =  "bb";
        assertEquals(out,pa.longestPalindrome(str));
    }
}