package com.zju.cst.datastructure;

import sun.font.DelegatingShape;

import java.util.Arrays;

/**
 * @author wulixz
 * @date 10/21/19 : 2:43 PM
 * @introduction :
 */
public class ArrayListImpl implements ListService {

    //个数
    public int size;

    private Object[] elementData;

    private static final int DEFAULT_CAPACITY = 10;

    public ArrayListImpl(){
        this(DEFAULT_CAPACITY);
    }

    public ArrayListImpl(int initialCapacity){
        if (initialCapacity>0){
            this.elementData = new Object[initialCapacity];
        }else {
            throw new RuntimeException("the length of array should be bigger than 0");
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        if (index >= size || index < 0){
            throw new RuntimeException("the index should be big or equal 0  and small than the length of this array");
        }
        return elementData[index];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < this.size; i++) {
            if (elementData[i] == o){
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (elementData[i] == o){
                return i;
            }
        }
        return 0;
    }

    @Override
    public void add(int index, Object element) {
        if (index >= size || index < 0){
            throw new RuntimeException("the index should be big or equal 0  and small than the length of this array");
        }
        if (size >= elementData.length -1 ){
            grow();
        }
        System.out.println(size);
        System.out.println(elementData.length);
        for (int i = size -1 ; i >= index; i --){
            elementData[i+1] = elementData[i];
        }
        elementData[index] = element;
        size ++;
    }

    @Override
    public boolean add(Object o) {
        if (this.size >= elementData.length){
            grow();
        }
        elementData[size++] = o;
//        this.add(size ++,o);
        return true;
    }

    @Override
    public boolean addBefore(Object o, Object e) {
        return false;
    }

    @Override
    public boolean addAfter(Object o, Object e) {
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public Object replace(int index, Object o) {
        return null;
    }

    private void grow(){
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        elementData = Arrays.copyOf(elementData, newCapacity);
    }
}

