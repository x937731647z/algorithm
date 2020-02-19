package com.zju.cst.leetcode;

import com.zju.cst.algorithm.ListNode;
import com.zju.cst.list.List;

import javax.swing.plaf.IconUIResource;

/**
 * @author wulixz
 * @date 9/18/19 : 4:34 PM
 * @introduction :Given linked list: 1->2->3->4->5, and n = 2.
 * <p>
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 */
public class RemoveFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        ListNode p = head;
        ListNode q = head;

        for (int i = 0; i < n; i++) {
            q = q.next;
        }

        if (q == null) {
            head = head.next;
            return head;
        }

        while (q.next != null) {
            p = p.next;
            q = q.next;
        }
        p.next = p.next.next;
        return head;
    }

}


