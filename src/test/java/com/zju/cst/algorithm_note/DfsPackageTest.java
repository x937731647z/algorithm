package com.zju.cst.algorithm_note;

import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class DfsPackageTest {

    DfsPackage dfsPackage;
    @Before
    public void setDfsPackage(){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int v = sc.nextInt();

        int w[] = {3,5,1,2,2};
        int c[] = {4,5,2,1,3};
        dfsPackage = new DfsPackage(5,8,w,c);
    }

    @Test
    public void dfsPack() {
        int result = 10;
        dfsPackage.dfsPack(0,0,0);
        assertEquals(10,dfsPackage.max);
    }
}