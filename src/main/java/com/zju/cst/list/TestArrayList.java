package com.zju.cst.list;

public class TestArrayList {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(123);
		list.add(321);
		list.add(456);
		list.add(678);
		list.add(789);	
		System.out.println("�б����֮ǰ��С��"+ list.size());
		list.add(3,666);
		System.out.println("�б����֮���С��"+ list.size());
		System.out.println(list.get(3));
		System.out.println("---------------");
		
		for(int i = 0; i < list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---------------");
		System.out.println(list.toString());
	}
	
}
