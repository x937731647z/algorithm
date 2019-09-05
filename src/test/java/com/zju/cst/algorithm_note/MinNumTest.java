package com.zju.cst.algorithm_note;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinNumTest {

    MinNum minNum;
    @Before
    public void setup(){
        minNum = new MinNum();
    }

    @Test
    public void num2001154test(){
        int [ ] num = {2,0,0,1,1,5,4};
        int result = 1001245;
        Assert.assertEquals(result,minNum.num(num));

    }


    @Test
    public void num000test(){
        int [ ] num = {0,0,0};
        int result = 0;
        Assert.assertEquals(result,minNum.num(num));

    }

    @Test(expected = RuntimeException.class)
    public void nonetest(){
        minNum.num(null);
    }

}