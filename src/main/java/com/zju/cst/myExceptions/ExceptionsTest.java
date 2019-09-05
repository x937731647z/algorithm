package com.zju.cst.myExceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ExceptionsTest {
    public static void main(String[] args) {

        int i = 8;
        if ( i > 5){
            throw new MyArrayIndexOutOfBoundException("My Array Index Out Of BoundException");
        }
        System.out.println(i >> 1);
    }
}
