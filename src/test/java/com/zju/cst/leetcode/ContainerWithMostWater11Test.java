package com.zju.cst.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerWithMostWater11Test {
    ContainerWithMostWater11 containerWithMostWater11;

    @Before
    public void setContainerWithMostWater11(){
        containerWithMostWater11 = new ContainerWithMostWater11();
    }
    @Test
    public void maxArea() {
        int [] list= {1,8,6,2,5,4,8,3,7};
        assertEquals(49, containerWithMostWater11.maxArea(list));
    }
}