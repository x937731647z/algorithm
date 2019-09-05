package com.zju.cst.algorithm_note;

public class GreatCommonDivisor {
    public int greatComDivisor(int a,int b){
        if (b > a){
            int tmp;
            tmp = a ;
            a = b;
            b = tmp;
        }
        return b == 0 ? a : greatComDivisor(b, a % b);
    }
}
