package com.zju.cst.leetcode;

import com.zju.cst.algorithm.ListNode;
import com.zju.cst.list.List;

/**
 * @author wulixz
 * @date 9/24/19 : 5:27 PM
 * @introduction :
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        int first = Math.min(l1.val, l2.val);
        ListNode listNode = new ListNode(first);
        ListNode x = listNode;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                x.next = l1;
                l1 = l1.next;
            } else {
                x.next = l2;
                l2 = l2.next;
            }
            x = x.next;
        }
        x.next = l1 != null ? l1: l2;
        return listNode;
    }
}

