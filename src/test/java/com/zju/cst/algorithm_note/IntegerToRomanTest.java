package com.zju.cst.algorithm_note;

import com.zju.cst.leetcode.IntegerToRoman;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class IntegerToRomanTest {
    IntegerToRoman integerToRoman;

    @Before
    public void setIntegerToRoman(){
        integerToRoman = new IntegerToRoman();
    }
    @Test
    public void intoRoman3_to_III() {
        String result = "III";
        int num = 3;
        assertEquals(result,integerToRoman.intoRoman(num));
    }
    @Test
    public void intoRoman4_to_IV() {
        String result = "IV";
        int num = 4;
        assertEquals(result,integerToRoman.intoRoman(num));
    }
    @Test
    public void intoRoman9_to_IX() {
        String result = "IX";
        int num = 9;
        assertEquals(result,integerToRoman.intoRoman(num));
    }
    @Test
    public void intoRoman58_to_LVIII() {
        String result = "LVIII";
        int num = 58;
        assertEquals(result,integerToRoman.intoRoman(num));
    }
    @Test
    public void intoRoman1994_to_MCMXCIV() {
        String result = "MCMXCIV";
        int num = 1994;
        assertEquals(result,integerToRoman.intoRoman(num));
    }
}
