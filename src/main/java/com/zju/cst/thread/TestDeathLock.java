package com.zju.cst.thread;

public class TestDeathLock {
  public static void main(String[] args) {
    DeadthLock deadthLock1 = new DeadthLock();
      DeadthLock deadthLock2 = new DeadthLock();
      deadthLock1.flag = 1;
      deadthLock2.flag = 0;
    Thread thread1 = new Thread(deadthLock1);
      Thread thread2 = new Thread(deadthLock2);
    thread1.start();
    thread2.start();
  }
}
