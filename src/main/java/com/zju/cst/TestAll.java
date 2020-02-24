package com.zju.cst;

import com.zju.cst.sort.Test;

import java.util.*;

/**
 * @author wulixz
 * @date 1/30/20 : 6:36 PM
 * @introduction :
 */
public class TestAll {
    public static void main(String[] args) {
//        String str = "aaacbbdddd";
//        System.out.println(1 << 30);

        String str = "abrctduefghij";
//        String str = "=ftrabce";
//        String str = "qrrstuabcrrsdefghijklmnopvwxyz";
        Map<Character,Integer> map = new HashMap<>();


        for (char c : str.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        for (Map.Entry<Character,Integer> m : map.entrySet()
             ) {
            System.out.println(m.getKey() + "  -  " + m.getValue());
        }
    }
}
