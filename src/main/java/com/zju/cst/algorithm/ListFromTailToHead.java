package com.zju.cst.algorithm;

import java.util.ArrayList;
import java.util.Stack;

public class ListFromTailToHead {
  public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    if (listNode == null) return new ArrayList();
    Stack<Integer> stack = new Stack<Integer>();
    int tmp = 1; // 注意取1 是计算listnode为空的最后一个数
    while (listNode.next != null) {
      stack.push(listNode.val);
      listNode = listNode.next;
      tmp++;
    }
    stack.push(listNode.val);
    ArrayList arraylist = new ArrayList();
    for (int i = 0; i < tmp; i++) {
      int num = (int) stack.pop();
      arraylist.add(num);
    }
    return arraylist;
  }
}
