package com.zju.cst.algorithm_note;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    Fibonacci fibonacci;
    @Before
    public void setUp() throws Exception {
        fibonacci = new Fibonacci();
    }

    @Test
    public void f() {
        int num = 6;
        int result =8 ;
        assertEquals(result, fibonacci.F(num));
    }
}