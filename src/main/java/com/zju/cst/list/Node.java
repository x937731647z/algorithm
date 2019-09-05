package com.zju.cst.list;

public class Node {

	Object data;
	
	Node next;
	
	public Node() {
		
	}
	
	public Node(Object data) {
		super();
		this.data = data;
	}
	public Node(Object data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Object getData() {
		return data;
	}
	
	public Node getNext() {
		return next;
	}
		
	
}
