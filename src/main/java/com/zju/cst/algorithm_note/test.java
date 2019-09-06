package com.zju.cst.algorithm_note;

import java.util.LinkedList;

public class test {
    public static void main(String[] args) {


        java.util.Queue queue = new LinkedList();
        //入队
        queue.offer("张三");
        queue.offer("李四");
        queue.offer("王五");
        //获取队头元素
        System.out.println(queue.element());
        //出队
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        queue.offer("赵六");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }
}
