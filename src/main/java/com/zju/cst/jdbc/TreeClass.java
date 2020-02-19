package com.zju.cst.jdbc;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author wulixz
 * @date 9/15/19 : 12:10 AM
 * @introduction :
 */
public class TreeClass {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(4);
        treeSet.add(1);

        System.out.println(treeSet);
        Iterator<Integer> it = treeSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for (Integer itforeach:
             treeSet) {
            System.out.println(itforeach);
        }
    }
}
