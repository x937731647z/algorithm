package com.zju.cst.sort;

public class InnerSingle {
    private InnerSingle(){

    }
    private static class SingletonClassInstance{
        private static final InnerSingle instance = new InnerSingle();
    }
    public static InnerSingle getInstance(){
        return SingletonClassInstance.instance;
    }
}
