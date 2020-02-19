package com.zju.cst.leetcode;

import com.zju.cst.algorithm.ListNode;

/**
 * @author wulixz
 * @date 9/24/19 : 6:13 PM
 * @introduction :
 */
public class MergeTwoSortedListsRecursion {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)return l2;
        if (l2 == null) return  l1;
        if (l1.val <= l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }

    }
}
