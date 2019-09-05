package com.zju.cst.java;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class QueueTest {
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String>();
		queue.add("111111111111");
		queue.add("2222222222222222222");
		queue.poll();
		Stack<String> stack = new Stack<>();
		stack.push("123");
		stack.pop();
		
		Deque<String> deque;
		Map<String, Integer> map= new HashMap<>();
		ArrayList<String> arrayList = new ArrayList<>();
		ListIterator listIterator = arrayList.listIterator();
		
	}

}
