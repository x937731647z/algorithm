package com.zju.cst.list;

public class DoubleNode {
	

	Object  data;
	DoubleNode pre;
	DoubleNode next;
	
	public DoubleNode() {		
	}
	public DoubleNode(Object data) {
		super();
		this.data = data;
	}
	public DoubleNode(Object data, DoubleNode next) {
		super();
		this.data = data;
		this.next = next;
	}  
	public void setData(Object data){
		this.data = data;
	}
	public Object getData(){
		return this.data;
	}
	public void setPre(DoubleNode pre){
		this.pre = pre;
	}
	public Object getPre(){
		return pre;
	}
	public void setNext(DoubleNode next){
		this.next = next;
	}
	public Object getNext(){
		return next;
	}
}
