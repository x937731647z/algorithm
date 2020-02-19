package com.zju.cst.thread;

/**
 * @author wulixz
 * @date 9/16/19 : 10:53 PM
 * @introduction :
 */
public class ThreadRunnbale implements Runnable {

    static int count = 0;

    @Override
    public void run() {
        System.out.println("this is runnable : " + Thread.currentThread().getName());
        for (int i = 0 ; i < 5; i ++){
            System.out.println("this is test : "+ i +"   "+ Thread.currentThread().getName() + "      " + count++);

        }
    }
}

class RunnableTest{
    public static void main(String[] args) {
        ThreadRunnbale threadRunnbale = new ThreadRunnbale();
        Thread thread1 = new Thread(threadRunnbale,"Runnable1");
        thread1.start();

        Thread thread2 = new Thread(threadRunnbale,"Runnable2");
        thread2.start();
    }
}
