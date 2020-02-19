package com.zju.cst.datastructure;

import java.util.LinkedList;

/**
 * @author wulixz
 * @date 10/22/19 : 3:49 PM
 * @introduction :
 */
public class BinaryConvert {

    public void Convert(int n){
        LinkedList list = new LinkedList();
        int res = n;
        do {
            int mod = res % 2;
            res = res / 2;
            list.push(mod);
        }while (res > 0);
        while (list.size() != 0){
            System.out.print(list.pop());
//            list.pop();
        }
//        for (int i = 0 ; i < list.size() ; i++){
//            System.out.print(list.get(i));
//        }
    }
}
class testConvert{
    public static void main(String[] args) {
        BinaryConvert bc = new BinaryConvert();
        bc.Convert(13);
    }
}
