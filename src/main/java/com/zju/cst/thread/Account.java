package com.zju.cst.thread;

/**
 * @author wulixz
 * @date 9/17/19 : 11:13 AM
 * @introduction :
 */
public class Account {

    public static int number;

    public synchronized void Create() {

           if (number >= 20) {
               System.out.println("商品很多了，不需要了");
               try {
                   this.wait();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           } else {
               number++;
               System.out.println("商品增加了，现在有   " + number);
               notifyAll();
           }

    }

    public synchronized void Consume() {

            if (number <= 0) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                number--;
                System.out.println("商品被消耗了，现在还剩下   " + number);
                notifyAll();
            }
    }
}

class User implements Runnable {
    Account account;
    public User(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        System.out.println("消费者开始消费");
        while (account.number >= 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.Consume();
        }
    }
}

class Seller implements Runnable {
    Account account;

    public Seller(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        System.out.println("生产者开始生产");
        while (account.number < 20) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.Create();
        }

    }
}

class TestDraw {
    public static void main(String[] args) {
        Account account = new Account();
        User user = new User(account);
        User user1 = new User(account);
        Seller seller = new Seller(account);
        Thread thread = new Thread(user, "消费者");
        Thread thread2 = new Thread(seller, "商家");
        Thread thread4 = new Thread(seller, "商家");
        Thread thread5 = new Thread(seller, "商家");
        Thread thread3 = new Thread(user1,"消费者2");
        thread.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}