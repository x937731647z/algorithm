package com.zju.cst.thread;

public class DeadthLock implements Runnable {

  static Goods goods1 = new Goods();
  static Goods goods2 = new Goods();
  int flag = 1;

  @Override
  public void run() {
      System.out.println("flag = "+ flag);
     if (flag == 1){
          synchronized (goods1) {
              try {
                  Thread.sleep(500);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
              System.out.println("hello  goods1");

              synchronized (goods2){
                  System.out.println("hello goods2");
              }


          }
      }
      if (flag == 0){

         synchronized (goods2){
             try {
                 Thread.sleep(500);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             System.out.println("hello goods3");
             synchronized (goods1) {
                 System.out.println("hello  goods1");
             }
         }
          }
      //    flag = false;
      }

  public static void main(String[] args) {
    //
      DeadthLock d1 = new DeadthLock();
      DeadthLock d2 = new DeadthLock();
      d1.flag = 1;
      d2.flag = 0;
      Thread thread1 = new Thread(d1);
      Thread thread2 = new Thread(d2);
      thread1.start();
      thread2.start();

  }
}

