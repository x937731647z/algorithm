package com.zju.cst.datastructure;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayListImplTest {

    ArrayListImpl arrayList;

    @Before
    public void setUp() throws Exception {
        arrayList = new ArrayListImpl();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(3,6);
        for (int i = 0 ;i < arrayList.size(); i++){
            System.out.printf("%s\t",arrayList.get(i));
        }
    }
    @Test
    public void size() {
        int size = arrayList.size();
        assertEquals(6,size);
    }

    @Test
    public void get() {
        Object a = arrayList.get(1);
        assertEquals(2,a);
    }

    @Test
    public void isEmpty() {
        boolean res = arrayList.isEmpty();
        assertEquals(false,res);
    }

    @Test
    public void contains() {
    }

    @Test
    public void indexOf() {
    }

    @Test
    public void add() {
    }

    @Test
    public void testAdd() {
    }

    @Test
    public void addBefore() {
    }

    @Test
    public void addAfter() {
    }

    @Test
    public void remove() {
    }

    @Test
    public void testRemove() {
    }

    @Test
    public void replace() {
    }
}