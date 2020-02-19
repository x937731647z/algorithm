package com.zju.cst.juc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wulixz
 * @date 9/19/19 : 2:22 PM
 * @introduction :
 */
public class TestLock {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(ticket," seller 1").start();
        new Thread(ticket," seller 2").start();
        new Thread(ticket," seller 3").start();
    }
}

class Ticket implements Runnable{
    public volatile int ticket = 5;
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            lock.lock();
            try {
                if (ticket > 0 ){
                    System.out.println(Thread.currentThread().getName()+ "   :   has ordered the ticket, so the left tickets are  " + --ticket);
                }else {
                    System.out.println("finish");
                    break;
                }
            } finally {
                System.out.println("okkkkokoko");
                lock.unlock();
            }

        }
    }
}
