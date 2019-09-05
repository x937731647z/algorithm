package com.zju.cst.sort;

public class LazySingle {
    private LazySingle(){

    }
    private static LazySingle instance;

    public static LazySingle getInstance(){
        if ( instance == null){
        synchronized (LazySingle.class){
                instance =  new LazySingle();
            }
        }
        return instance;
    }
}
