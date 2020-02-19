package com.zju.cst.juc;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wulixz
 * @date 9/19/19 : 2:34 PM
 * @introduction :
 */
public class TestProductorAndCunsumer {
    public static void main(String[] args) {
        Cleck cleck = new Cleck();
        Product product1 = new Product(cleck);
        Product product2 = new Product(cleck);
        Consumer consumer1 = new Consumer(cleck);
        Consumer consumer2 = new Consumer(cleck);

        Thread thread1 = new Thread(product1,"seller 1");
        Thread thread3 = new Thread(product2,"seller 2");
        Thread thread2 = new Thread(consumer1,"consumer 1");
        Thread thread4 = new Thread(consumer2,"consumer 2");
//    Thread thread1 = new Thread(product1,"seller 1");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}

class Cleck {
    private int product = 0;

    public synchronized void get() {

        while (product >= 10) {    // while是为了避免虚假唤醒问题，应该总是使用 在循环中。
            System.out.println("enough");
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            System.out.println(Thread.currentThread().getName() + "  :   " + ++product);
            this.notifyAll();


    }

    public synchronized void sale() {
        while (product <= 0) {   // while是为了避免虚假唤醒问题，应该总是使用 在循环中。
            System.out.println("no goods here");
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            System.out.println(Thread.currentThread().getName() + "  :   " + --product);
            this.notifyAll();



    }
}

class Product implements Runnable {
    private Cleck cleck;

    public Product(Cleck cleck) {
        this.cleck = cleck;
    }

    @Override
    public void run() {

        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cleck.get();
        }
    }
}

class Consumer implements Runnable {
    private Cleck cleck;

    public Consumer(Cleck cleck) {
        this.cleck = cleck;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            cleck.sale();
        }
    }




}