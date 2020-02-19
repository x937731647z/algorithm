package com.zju.cst.leetcode;

import com.zju.cst.algorithm.ListNode;

/**
 * @author wulixz
 * @date 1/23/20 : 2:54 PM
 * @introduction :
 */
public class MergeList {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode node = lists[0];
        int nodeVal = node.val;
        ListNode tmp = node.next;
        int tmpVal = tmp.val;
        ListNode res = null;
        for (int i = 1 ; i < lists.length; i ++ ){
            ListNode current = lists[i];



        }
        return res;
    }

}
