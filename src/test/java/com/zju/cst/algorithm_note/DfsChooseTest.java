package com.zju.cst.algorithm_note;

import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class DfsChooseTest {
    DfsChoose dfsCho;
    @Before
    public void setDfsCho(){
        int A[] = {2,3,3,4};
        dfsCho = new DfsChoose(4,2,6,A);
    }
    @Test
    public void dfsChoose() {
        dfsCho.dfsChoose(0,0,0,0);
       for (int i = 0 ; i < dfsCho.ans.size(); i ++ ){
           System.out.println(dfsCho.ans.get(i));
       }
    }
}