package com.zju.cst.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.text.DecimalFormat;
import java.util.HashMap;

import static org.junit.Assert.*;

public class Q3NoRepeatCharTest {
    Q3NoRepeatChar noRe ;

    @Before
    public void setUp() throws Exception {
        noRe = new Q3NoRepeatChar();
    }

    @Test
    public void lengthOfLongestSubstring() {
        int res = 3;
        String str = "abcabcbb";

        assertEquals(res,noRe.lengthOfLongestSubstring(str));
    }
    @Test
    public void lengthOfLongestSubstring_dcdf() {
        int res = 3;
        String str = "dvdf";
        assertEquals(res,noRe.lengthOfLongestSubstring(str));
    }

    @Test
    public void hash(){
        HashMap<Character,Integer> map = new HashMap<>();
        String str = "abcabcbb";
        for (int i = 0 ; i < str.length();i++){
            map.put(str.charAt(i),i);
        }
        System.out.println(map.get('b'));

    }


    @Test
    public void test(){
        DecimalFormat df = new DecimalFormat("0.00000");
        System.out.println((float) 5/2 );
        System.out.println( df.format((float)5/2));

    }
}