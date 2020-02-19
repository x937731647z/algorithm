package com.zju.cst.juc;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/**
 * @author wulixz
 * @date 9/19/19 : 11:00 AM
 * @introduction :
 */
public class TestCountDownLatch {


    public static void main(String[] args) {
        final CountDownLatch latch = new CountDownLatch(5);
        LatchDemo ld = new LatchDemo(latch);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            new Thread(ld).start();
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("the time of operation  :  "  + ( end - start));
    }
}

class LatchDemo implements Runnable {

    private CountDownLatch latch;

    public LatchDemo(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
     synchronized(this){
         try {
             for (int i = 0; i < 50; i++) {
                 if (i % 2 == 0) {
                     System.out.println(i);
                 }
             }
         } finally {
             latch.countDown();
         }
     }

    }
}