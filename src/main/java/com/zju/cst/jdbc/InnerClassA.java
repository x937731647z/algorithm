package com.zju.cst.jdbc;

/**
 * @author wulixz
 * @date 9/14/19 : 4:11 PM
 * @introduction :
 */
public class InnerClassA {

    int a;
    int b;

    public InnerClassA() {
        System.out.println("original");
    }
    public InnerClassA(int a ,int b){
        System.out.println("contains");
    }
    {
        System.out.println("好的");
    }

    public static void main(String[] args) {
        InnerClassA innerClassA = new InnerClassA();

    }
}

class Generic<T>{

}
