package com.zju.cst.leetcode;

import com.zju.cst.algorithm.ListNode;
import org.junit.Before;
import org.junit.Test;

public class q2AddTwoNumbersTest {

    Q2addTwoNumbers add ;

    @Before
    public void setAdd(){
        add = new Q2addTwoNumbers();



    }

    @Test
    public void addTwoNumbers() {
        ListNode node1 = new ListNode(9);

        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(9);
        ListNode node4 = new ListNode(9);
        ListNode node5 = new ListNode(9);
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode res = add.addTwoNumbers(node1,node2);
        while (res != null){
            System.out.print(res.val);
            res = res.next;
        }


    }
}