package com.zju.cst.algorithm_note;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongComSeqTest {
    LongComSeq longComSeq;

    @Before
    public void setUp() throws Exception {
        longComSeq = new LongComSeq();
    }

    @Test
    public void longCommonSubSequence() {
        char[] Arr = {'s','a','d','s','t','o','r','y'};
        char[] Brr = {'a','d','m','i','n','s','o','r','r','y'};
        int result = 6;
        assertEquals(result, longComSeq.longCommonSubSequence(Arr,Brr));
    }

}