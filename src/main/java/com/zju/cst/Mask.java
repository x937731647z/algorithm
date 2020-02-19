package com.zju.cst;

import com.sun.tools.corba.se.idl.constExpr.Or;

/**
 * @author wulixz
 * @date 1/30/20 : 10:32 PM
 * @introduction :
 */
public class Mask {
    public static void main(String[] args) {
        Mask mask = new Mask();
        mask.calculate(7);
    }
    public int calculate(int nums){
        int next = nums - 1;
        int res = nums;
        while (next >= 2){
           int mod =  (res * next ) % 10;
           int value = res * next / 10;
           while (mod == 0){
               mod = value % 10;
               value = res * next / 10;
           }
            next --;
            res = mod;
        }
        System.out.println(res);
        return res;
    }

}
