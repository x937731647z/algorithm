package com.zju.cst.juc;

import java.util.Random;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author wulixz
 * @date 9/19/19 : 4:51 PM
 * @introduction :
 *
 * ReadWriteLock 读写锁
 * 写写 / 读写要互斥
 * 读读不需要互斥
 */
public class TestReadWriteLock {
    public static void main(String[] args) {
        final ReadWriteLockDemo rw = new ReadWriteLockDemo();
        new Thread(new Runnable() {
            @Override
            public void run() {
                rw.write((new Random().nextInt()));
            }
        },"write").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                rw.write((new Random().nextInt()));
            }
        },"write2").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0 ; i < 20; i ++){
                    rw.read();
                }
            }
        },"read").start();
    }
}
class ReadWriteLockDemo{
    private int number = 0 ;
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    public void read(){
        lock.readLock().lock();//上锁
        try {
            System.out.println(Thread.currentThread().getName() + "  :   " + number );
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.readLock().unlock();//释放锁
        }
    }

    public void write(int number){
        lock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + "  :   " + number);
            this.number = number;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
        }
    }
}