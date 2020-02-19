package com.zju.cst.juc;

/**
 * @author wulixz
 * @date 9/18/19 : 2:11 PM
 * @introduction :
 */
public class JucTest {
    public static void main(String[] args) {
        Juc juc = new Juc();
        Thread thread = new Thread(juc);
        thread.start();

        while (true){
            if (juc.isFlag()){
                System.out.println("flag in the main  :  "  + juc.isFlag());
                break;
            }
//            juc.showInfo();
        }
    }
}

class Juc implements Runnable{

    public  boolean flag = false;

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }

        flag = true;
        System.out.println(" the flag is : " + flag);
    }

    void showInfo(){
    }

    public boolean isFlag() {
//        System.out.println("showInfo  : " + flag);
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}