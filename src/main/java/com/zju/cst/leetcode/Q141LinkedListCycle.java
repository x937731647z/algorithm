package com.zju.cst.leetcode;

import com.zju.cst.algorithm.ListNode;
import com.zju.cst.list.List;

import java.util.HashSet;

/**
 * @auther wulixz
 * @date 2020/2/24 3:10
 * @level
 * @desc
 * @example
 * @solution
 * @standard
 */
public class Q141LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        boolean flag = false;
        HashSet<ListNode> hashSet = new HashSet<>();
        ListNode slave = head;

        while (head.next != null) {
            if (hashSet.add(head)) {
                head = head.next;
            } else {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
