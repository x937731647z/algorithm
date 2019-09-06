package com.zju.cst.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanToIntegerTest {
    RomanToInteger romanToInteger;
    @Before
    public void setUp() throws Exception {
        romanToInteger = new RomanToInteger();
    }

    @Test
    public void rotoInte_III_to_3() {
        int resNum = 3;
        String RomanStr = "III";
        assertEquals(resNum, romanToInteger.rotoInte(RomanStr));

    }
    @Test
    public void rotoInte_IV_to_4() {
        int resNum = 4;
        String RomanStr = "IV";
        assertEquals(resNum, romanToInteger.rotoInte(RomanStr));

    }
    @Test
    public void rotoInte_IX_to_9() {
        int resNum = 9;
        String RomanStr = "IX";
        assertEquals(resNum, romanToInteger.rotoInte(RomanStr));
    }
    @Test
    public void rotoInte_LVIII_to_58() {
        int resNum = 58;
        String RomanStr = "LVIII";
        assertEquals(resNum, romanToInteger.rotoInte(RomanStr));

    }
    @Test
    public void rotoInte_MCMXCIV_to_1994() {
        int resNum = 1994;
        String RomanStr = "MCMXCIV";
        assertEquals(resNum, romanToInteger.rotoInte(RomanStr));

    }
    @Test
    public void rotoInte_MCAC_to_none() {
        int resNum = 3080;
        String RomanStr = "MMMXLV";
        assertEquals(resNum, romanToInteger.rotoInte(RomanStr));

    }
    @Test
    public void rotoInte_D_to_500() {
        int resNum = 500;
        String RomanStr = "D";
        assertEquals(resNum, romanToInteger.rotoInte(RomanStr));

    }
    @Test
    public void rotoInte_DCXXI_to_621() {
        int resNum = 621;
        String RomanStr = "DCXXI";
        assertEquals(resNum, romanToInteger.rotoInte(RomanStr));

    }
}