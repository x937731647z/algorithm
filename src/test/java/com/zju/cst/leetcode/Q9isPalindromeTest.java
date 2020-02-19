package com.zju.cst.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q9isPalindromeTest {

    Q9isPalindrome isPalindrome;

    @Before
    public void setUp() throws Exception {
        isPalindrome = new Q9isPalindrome();
    }

    @Test
    public void isPalindrome121() {
        boolean res = true;
        int input = 121 ;
        assertEquals(res,isPalindrome.isPalindrome(input));
    }
    @Test
    public void isPalindrome10() {
        boolean res = false;
        int input = 10 ;
        assertEquals(res,isPalindrome.isPalindrome(input));
    }
    @Test
    public void isPalindromeNegetive121() {
        boolean res = false;
        int input = -121 ;
        assertEquals(res,isPalindrome.isPalindrome(input));
    }
}