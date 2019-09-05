package com.zju.cst.algorithm_note;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BitOperationTest {
    BitOperation bitOperation;

    @Before
    public void setBitOperation(){
        bitOperation = new BitOperation();
    }
    @Test
    public void and() {
        int a = 4;
        int b = 5;
        int result = 4;
        assertEquals(result,bitOperation.and(a,b));
    }

    @Test
    public void or() {
    }

    @Test
    public void xor() {
    }

    @Test
    public void non() {
    }
}