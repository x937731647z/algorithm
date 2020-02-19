package com.zju.cst.algorithm_note;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongReSeqTest {

    LongReSeq longReSeq ;

    @Before
    public void setUp() throws Exception {
        longReSeq = new LongReSeq();
    }

    @Test
    public void longReSeq() {
        int result = 9;
        String str = "PATZJUJZTACCBCC";
        assertEquals(result,longReSeq.longReSeq(str));


    }
}