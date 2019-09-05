package com.zju.cst.thread;

public class Goods {

    public   int apple;
    public synchronized void make(){
        if (apple >= 20){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else {
           apple ++;
            System.out.println("生产者:"+Thread.currentThread().getName()+"生产了第：" + apple + "个商品");
            notifyAll();
        }

    }
    public synchronized void eat(){
        if (apple <= 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("消费者:"+Thread.currentThread().getName()+"消费了第：" + apple + "个商品");
            apple --;
            notifyAll();
        }
    }
}
