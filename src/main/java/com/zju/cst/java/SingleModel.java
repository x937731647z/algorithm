package com.zju.cst.java;

/**
 * @author wulixz
 * @date 9/13/19 : 3:51 PM
 * @introduction :
 */
public class SingleModel {
    public  static  int count;
    private SingleModel(){
        count += 1 ;
    }
    private static SingleModel single = new SingleModel();

    public static SingleModel getInstance(){
        return single;
    }
    public static void cou(){
        System.out.println(count);
    }

    public static void main(String[] args) {
        SingleModel sing = SingleModel.getInstance();
        SingleModel sing2 = SingleModel.getInstance();
        SingleModel sing3 = SingleModel.getInstance();
        System.out.println(SingleModel.count);
    }
}
