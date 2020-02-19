package com.zju.cst.datastructure;

import com.zju.cst.algorithm.ListNode;
import sun.awt.image.ImageWatched;

/**
 * @author wulixz
 * @date 10/21/19 : 2:58 PM
 * @introduction :
 */
public class LinkedListImpl implements ListService {
    LinkedNode head = new LinkedNode();
    int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
        }
        LinkedNode getNode = new LinkedNode();
        LinkedNode current  = head;
        for (int i = 0 ; i < index;i ++){
            current = current.next;
        }
        getNode = current.next;

        return getNode.data;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public void add(int index, Object element) {
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
        }
        //新建要插入的节点
        LinkedNode addNode = new LinkedNode(element);
        //设置当前游动的节点
        LinkedNode current  = head;
        //循环寻找下一个节点
        for (int i = 0 ; i< index; i ++){
            current = current.next;
        }
        //替换节点
        addNode.next =  current.next;
        current.next = addNode;
        size ++;
    }

    @Override
    public boolean add(Object o) {
        this.add(size,o);
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
}

class LinkedTest{
    public static void main(String[] args) {
        LinkedListImpl impl = new LinkedListImpl();
        impl.add(123);
        impl.add(321);
        impl.add(456);
        impl.add(678);
        impl.add(789);
        impl.add(879);
        impl.add(4,100);
        int len =  impl.size();
//        System.out.println(len);
        for (int i = 0 ; i < len ; i ++){
            System.out.println(impl.get(i));
        }
    }
}