package com.zju.cst.thread;

/**
 * @author wulixz
 * @date 9/17/19 : 4:52 PM
 * @introduction :
 */
public class Web12306 implements Runnable {

    public static int count = 99;
    public static String name;

    @Override
    public void run() {
        while (true) {

            synchronized (this) {
                if (count <= 0) {
                    System.out.println("没有票了");
                    break;
                }
                System.out.print(Thread.currentThread().getName() + "     在买票         ");
                count--;
                if (count ==0){
                    System.out.println();
                    System.out.println("没有票了");
                }else {
                    System.out.println("现在还有余票   ：   " + count + "  张");
                }
                name = Thread.currentThread().getName();
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Web12306Demo {
    public static void main(String[] args) {
        Web12306 web = new Web12306();
        System.out.println("AAAA 开始买票 ");
        Thread aaa = new Thread(web, "AAAA");
        aaa.start();
        System.out.println("BBBB 开始买票 ");
        Thread bbb = new Thread(web, "BBBB");
        bbb.start();
        System.out.println("CCCC 开始买票 ");
        Thread ccc = new Thread(web, "CCCC");
        ccc.start();

    }
}