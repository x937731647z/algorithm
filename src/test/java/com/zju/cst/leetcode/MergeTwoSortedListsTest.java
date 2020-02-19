package com.zju.cst.leetcode;

import com.zju.cst.algorithm.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTwoSortedListsTest {
    MergeTwoSortedLists merge;
    @Before
    public void setUp() throws Exception {
        merge = new MergeTwoSortedLists();
    }

    @Test
    public void mergeTwoLists() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode l3 = new ListNode(1);
        l3.next = new ListNode(1);
        l3.next.next = new ListNode(2);
        l3.next.next.next = new ListNode(3);
        l3.next.next.next.next = new ListNode(4);
        l3.next.next.next.next.next = new ListNode(5);
        assertEquals(l3,merge.mergeTwoLists(l1,l2));
    }
}