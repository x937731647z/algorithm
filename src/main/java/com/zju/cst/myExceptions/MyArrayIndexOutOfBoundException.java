package com.zju.cst.myExceptions;

public class MyArrayIndexOutOfBoundException extends RuntimeException{
    public MyArrayIndexOutOfBoundException() {
        super();
    }

    public MyArrayIndexOutOfBoundException(String message) {
        super(message);
    }
}
