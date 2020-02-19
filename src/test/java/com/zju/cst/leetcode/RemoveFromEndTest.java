package com.zju.cst.leetcode;


/**
 * @author wulixz
 * @date 9/18/19 : 4:34 PM
 * @introduction :Given linked list: 1->2->3->4->5, and n = 2.
 *
 *                 After removing the second node from the end, the linked list becomes 1->2->3->5.
 */


import com.zju.cst.algorithm.ListNode;
import com.zju.cst.list.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveFromEndTest {

    RemoveFromEnd removeFromEnd;

    @Before
    public void setUp() throws Exception {
        removeFromEnd = new RemoveFromEnd();
    }

    @Test
    public void removeNthFromEnd() {
        ListNode listNode = new ListNode(1);
        ListNode node2 = new ListNode(2);
        listNode.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;
        ListNode node5 = new ListNode(5);
        node4.next = node5;

        int numN = 2;

        ListNode listNodeRes = listNode;
        ListNode resNode2 = new ListNode(2);
        listNodeRes.next = resNode2;
        ListNode resNode3 = new ListNode(3);
        resNode2.next = resNode3;
        ListNode resNode4 = new ListNode(5);
        resNode3.next = resNode4;
        Assert.assertEquals(listNodeRes,removeFromEnd.removeNthFromEnd(listNode,2));
    }
}