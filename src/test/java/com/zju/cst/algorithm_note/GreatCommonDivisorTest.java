package com.zju.cst.algorithm_note;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GreatCommonDivisorTest {
    GreatCommonDivisor  greatCommonDivisor;

    @Before
    public void setGreatCommonDivisor(){
        greatCommonDivisor = new GreatCommonDivisor();
    }
    @Test
    public void greatComDivisor() {
        int a = 10, b = 4;
        int result = 2;
        Assert.assertEquals(result,greatCommonDivisor.greatComDivisor(a,b));
    }
}