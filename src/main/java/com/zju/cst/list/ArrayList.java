package com.zju.cst.list;

import java.util.Arrays;

/**
 *  ????
 *  ?????????ÔÖ???????????Å£
 * @author dell
 *
 */
public class ArrayList implements List{
	
	private Object[] elementData; //??????????,??¶ƒ???????
	
	private int size; //????????????????,????????? 
	
	public ArrayList() {
		//??????????????????4
		this(4);
		//??????????,??????0
		//elementData = new Object[] {};
	}
	
	public ArrayList(int initialCapacity) {
	
		//????????????????????
		elementData = new Object[initialCapacity];
		//????????????????????0
		//size = 0;
		 
	}
 
	@Override
	public int size() {  
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public Object get(int i) {
		if (i < 0 || i >= size) {
			throw new MyArrayIndexOutOfBoundsException("?????????"+i);		
		}
		// TODO Auto-generated method stub
		return elementData[i];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
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
		// TODO Auto-generated method stub
		
		if (size == elementData.length) {
			grow();
		}
		//????i????????
		for (int j = size; j >i; j--) {
			elementData[j] = elementData[j-1];	
			System.out.println(elementData[j]);
		}
		
		elementData[i] = e;
		size++;
		
	}

	@Override
	public void add(Object e) {
		
		if (size == elementData.length) {
			grow();
		}
		elementData[size ++] = e;
		// TODO Auto-generated method stub
		
	}
	
	public void grow() {
//		Object[] newList = new Object[elementData.length * 2];
//		for(int i =0; i < size;i++) {
//			newList[i] = elementData[i];			
//		}
//		elementData = newList;		
		elementData = Arrays.copyOf(elementData, elementData.length*2);
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
		// TODO Auto-generated method stub
		if (size == 0 ) {
			return "[]";
		}
		else {
			StringBuffer stringBuffer = new StringBuffer("[");
			for(int i=0; i<size;i++) {
				if (i == size-1) {
					stringBuffer.append(elementData[i]);
				}else {
					stringBuffer.append(elementData[i]+",");
				}
			}
			stringBuffer.append("]");	
			return stringBuffer.toString();
		}
		
	}
	

}
