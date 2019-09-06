package com.zju.cst.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TripletSumTest {

    TripletSum tripletSum;
    @Before
    public void setUp() throws Exception {
        tripletSum = new TripletSum();
    }

    @Test
    public void threeSum() {
        int[] input = {-1,0,1,2,-1,-4};
        List<List<Integer>> allList = new ArrayList<>();
        int[] line1 = {-1,-1,2};
        int[] line2 = {-1,0,1 };
        List<Integer> list1 = new ArrayList<>();
        for (int j = 0; j < 3; j ++){
                list1.add(line1[j]);
        }
        List<Integer> list2 = new ArrayList<>();
        for (int j = 0; j < 3; j ++){
            list2.add(line2[j]);
        }
        allList.add(list1);
        allList.add(list2);
        assertEquals(allList, tripletSum.threeSum(input));




    }
}