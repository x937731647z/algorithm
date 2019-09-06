package com.zju.cst.algorithm_note;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BFSblockTest {
    BFSblock bfSblock;
    @Before
    public void setup(){
        bfSblock = new BFSblock();
    }

    @Test
    public void initial() {
        int[][] martix = {
                {0,1,1,1,0,0,1},
                {0,0,1,0,0,0,0},
                {0,0,0,0,1,0,0},
                {0,0,0,1,1,1,0},
                {1,1,1,0,1,0,0},
                {1,1,1,1,0,0,0}};
        int result = 4;
        assertEquals(result,bfSblock.initial(martix));
    }

}