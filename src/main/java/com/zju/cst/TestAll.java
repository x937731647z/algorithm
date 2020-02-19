package com.zju.cst;

import com.zju.cst.sort.Test;

/**
 * @author wulixz
 * @date 1/30/20 : 6:36 PM
 * @introduction :
 */
public class TestAll {
    public static void main(String[] args) {
    }
    void make(){
//        TestA test = new TestA();
        TestA test;
        test = new TestA();
        System.out.println("ok");
    }

}

class TestA{
    TestB b;
    TestA(){
        b = new TestB(this);
    }

}

class TestB{
    TestA a;
    TestB(TestA a){
        this.a = a ;
    }
}