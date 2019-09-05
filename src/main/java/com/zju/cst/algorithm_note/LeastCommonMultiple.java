package com.zju.cst.algorithm_note;

public class LeastCommonMultiple {
    public int leastComMultiple(int a , int b){
        int multiple = greatComDivisor(a,b);
        return a / multiple * b;
    }
    public int greatComDivisor(int a, int b ){
        if (b > a ){
            int tmp ;
            tmp = b;
            b = a ;
            a = tmp;
        }
        return b==0 ? a : greatComDivisor(b,a%b);
    }
}
