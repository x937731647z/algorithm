package com.zju.cst.datastructure;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/**
 * 这是个列表接口，和存储方式无关
 */
public interface ListService {

    int size();

    Object get(int index);

    boolean isEmpty();

    boolean contains(Object o);

    int indexOf(Object o);

    void add(int index, Object element);

    boolean add(Object o);

    boolean addBefore(Object o, Object e);

    boolean addAfter(Object o, Object e);

    Object remove(int index);

    boolean remove(Object o);
    // 替换原始数据中第index位置的数据为 o，返回原始数据
    Object replace(int index, Object o);

}
