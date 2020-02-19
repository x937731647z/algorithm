package com.zju.cst.juc;

/**
 * @author wulixz
 * @date 9/19/19 : 4:00 PM
 * @introduction :
 */
public class TestABCAlternate {
    public static void main(String[] args) {
        AbcAlternate a = new AbcAlternate();
        AbcAlternate b = new AbcAlternate();
        AbcAlternate c = new AbcAlternate();
        new Thread(a,"A").start();
        new Thread(b,"B").start();
        new Thread(c,"C").start();
    }
}

class AbcAlternate implements Runnable{

    @Override
    public void run() {
       for (int i = 0 ; i < 5; i ++){
           System.out.println(Thread.currentThread().getName());
       }
    }
}
