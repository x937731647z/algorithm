package com.zju.cst.stackqueue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 借助栈实现进制转换 （将十进制转换成二进制）
 * @author dell
 *
 */
public class TestConvert {

	public static void main(String[] args) {
		
		int n = 100;
		int a = n;
		List list = new ArrayList();
		//定义一个空栈 
		Deque stack = new LinkedList();
		do {
			int  p = a % 2  ;
			stack.push(p);
			a = a / 2;
		}
		while(a > 0); 
		System.out.print(n+"----->");
		while(!stack.isEmpty()) {//当栈非空
			System.out.print(stack.poll());
		}

		
	}
}
