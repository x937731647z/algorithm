package com.zju.cst.juc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author wulixz
 * @date 9/20/19 : 11:02 AM
 * @introduction :
 */
public class TestThreadPool {
    public static void main(String[] args) {
        //1 创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(5);
        ThreadPoolDemo tpd = new ThreadPoolDemo();

        //2 为线程池中的线程分配任务
        for (int i = 0 ; i < 10 ; i ++){
            pool.submit(tpd);
        }
        //3 关闭线程池
        pool.shutdown();

    }
}
class ThreadPoolDemo implements Runnable{
    private  int i = 0;
    @Override
    public void run() {
        while (i<50){
            System.out.println(Thread.currentThread().getName() + "   :   " + i++);
        }
    }
}
