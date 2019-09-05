package com.zju.cst.algorithm_note;

public class test {
    public static void main(String[] args) {


        System.out.println(4%2);
        int a = 4;
        boolean flag = true;
        for (int  i = 2 ; i * i <= a; i ++){
            if (a % i == 0 ){
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
