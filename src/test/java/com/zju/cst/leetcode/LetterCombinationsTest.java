package com.zju.cst.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LetterCombinationsTest {
    LetterCombinations letterCombinations;

    @Before
    public void setUp() throws Exception {
        letterCombinations = new LetterCombinations();
    }

    @Test
    public void letterCombinations() {
        String input = "269";
        String[] Arr = {"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"};
        String[] Brr = {"amw", "amx", "amy", "amz", "anw", "anx", "any", "anz",
                "aow", "aox", "aoy", "aoz", "bmw", "bmx", "bmy", "bmz", "bnw",
                "bnx", "bny", "bnz", "bow", "box", "boy", "boz", "cmw", "cmx",
                "cmy", "cmz", "cnw", "cnx", "cny", "cnz", "cow", "cox", "coy", "coz"};
        List<String> str =  Arrays.asList(Brr);

        assertEquals(str, letterCombinations.letterCombinations(input));
    }
}