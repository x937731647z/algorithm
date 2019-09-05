package com.zju.cst.list;
import java.util.Deque;

public class TestSingleLinkedList {

	public static void main(String[] args) {
		List list = new SingleLinkedList();
		list.add(123);
		list.add(321);
		list.add(456);
		list.add(678);
		list.add(789);	 
		list.add(111);
		list.add(222);
		list.add(5,666);
		System.out.println(list.get(3));
		System.out.println("---------------");
		
		for(int i = 0; i < list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---------------");
		System.out.println(list.toString());
		Deque deque;
	}
	 
}
