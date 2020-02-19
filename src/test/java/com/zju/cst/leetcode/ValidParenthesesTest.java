package com.zju.cst.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {
    ValidParentheses vp;
    @Before
    public void setUp() throws Exception {
        vp = new ValidParentheses();
    }

    @Test
    public void str_isValid() {
        String str = "({[]})";
        boolean flag =true;
        assertEquals(flag,vp.isValid(str));
    }
    @Test
    public void str2_isValid() {
        String str = "([)]";
        boolean flag =false;
        assertEquals(flag,vp.isValid(str));
    }
    @Test
    public void stre_isValid() {
        String str = "()[]{}";
        boolean flag =true;
        assertEquals(flag,vp.isValid(str));
    }
}