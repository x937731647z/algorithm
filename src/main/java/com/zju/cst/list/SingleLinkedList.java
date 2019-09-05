package com.zju.cst.list;

public class SingleLinkedList implements List{
		
	Node head = new Node();
	
	int size;

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public Object get(int i) {
		// TODO Auto-generated method stub
		Node p = head;
		for(int j = 0;j <=i; j++) {
			p = p.next;
		}
		return p.data;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int indexOf(Object e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void add(int i, Object e) {
	//System.out.println(i);
		if(i > size || i < 0) {	
			throw new MyArrayIndexOutOfBoundsException("����ָ��Խ���쳣: "+ i);
		}
			
		//ͷָ��, ѭ������ָ	
		Node p = head;	
		System.out.println(head.hashCode());
		System.out.println(p.hashCode());
		System.out.println("+++++++++++++++++");
		for(int j = 0; j < i ; j++) {
			p = p.next;
			System.out.println("p.next: "+p.next);	
			System.out.println("p.data: "+p.data);
		}	
//		System.out.println("head.data: "+head.data);
//		System.out.println("head.next: "+head.next);	
//		System.out.println("p.next: "+p.next);	
//		System.out.println("p.data: "+p.data);
//		System.out.println("----------------");
		//����һ��ָ��
		Node  newNode = new Node();
		newNode.data = e;
		newNode.next = p.next;	
		p.next = newNode;
		System.out.println("head.next.data: "+head.next.data);
		System.out.println("p.next.data: "+p.next.data);
		//ָ��ֱ�Ӻ��
		size ++;
		
	}

	@Override
	public void add(Object e) {
		this.add(size, e);
		// TODO Auto-generated method stub	
	}

	@Override
	public boolean addBefore(Object obj, Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAfter(Object obj, Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object remove(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object replace(int i, Object e) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		if(size ==0)
			return "[]";
		else {
			Node p = head.next;
			StringBuffer stringbuffer = new StringBuffer("[");
			for(int i = 0 ; i <size; i++) {
				if( i == size-1) {
					stringbuffer.append(p.data);
				}
				else {
				stringbuffer.append(p.data + ",");	
				}
				p = p.next;
			}
			stringbuffer.append("]");
			
			return stringbuffer.toString();
		}
	}

	
}
