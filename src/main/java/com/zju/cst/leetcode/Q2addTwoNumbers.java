package com.zju.cst.leetcode;

import com.zju.cst.algorithm.ListNode;
import com.zju.cst.list.List;

/**
 * @author wulixz
 * @date 1/23/20 : 3:35 PM
 * @introduction :
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class Q2addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode cur = res;
        int carry = 0;
        while (l1 != null || l2 != null){
            int num1 =0;
            int num2 = 0;
            if (l1 != null){
                num1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null){
                num2 = l2.val;
                l2 = l2.next;
            }

            int tmp = num1 + num2 + carry;
            carry = tmp / 10;
            tmp = tmp % 10;
            cur.val = tmp;
            cur = cur.next;

        }
        if(carry > 0){
            cur.next = new ListNode(carry);
        }
        return res.next;
    }


}
