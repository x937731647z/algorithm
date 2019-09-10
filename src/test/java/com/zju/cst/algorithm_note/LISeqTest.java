package com.zju.cst.algorithm_note;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LISeqTest {
    LISeq liSeq ;
    @Before
    public void setUp() throws Exception {
        liSeq = new LISeq();
    }

    @Test
    public void lonIncreaseSeq() {
        int[] Arr = {1,2,3,-9,3,9,0,11};
        int result = 6;
        assertEquals(result, liSeq.lonIncreaseSeq(Arr));
    }
}