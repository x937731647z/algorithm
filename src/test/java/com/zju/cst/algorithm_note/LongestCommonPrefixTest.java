package com.zju.cst.algorithm_note;

import com.zju.cst.leetcode.LongestCommonPrefix;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {
    LongestCommonPrefix longestCommonPrefix;
    @Before
    public void setUp() throws Exception {
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    public void longestCommonPrefix_fl() {
        String[] strs = {"flower","flow","flight"};
        String res = "fl";
        assertEquals(res,longestCommonPrefix.longestCommonPrefix(strs));
    }
    @Test
    public void longestCommonPrefix_a() {
        String[] strs = {"aa","a"};
        String res = "a";
        assertEquals(res,longestCommonPrefix.longestCommonPrefix(strs));
    }
    @Test
    public void longestCommonPrefix_others() {
        String[] strs = {"dogs","dogcar","car"};
        String res = "";
        assertEquals(res,longestCommonPrefix.longestCommonPrefix(strs));
    }
}