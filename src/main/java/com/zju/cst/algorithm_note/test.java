package com.zju.cst.algorithm_note;

import java.util.*;

public class test {
    public static void main(String[] args) {
        String str = new String("1212");
        // 转成byte 第一位才是符号位
        str = "1010100";
        System.out.println(str);
//
//        byte s = (byte) Integer.parseInt(str,2);
//        System.out.println(s);
//
//        Deque<Character> stack  = new ArrayDeque<>();
//        stack.push('a');
//        stack.push('b');
//        stack.push('c');
//
//        while (stack.peek() != null){
//            System.out.println(stack.pop());
//        }
//
//        Queue<Character> queue = new LinkedList<>();
//        queue.offer('e');
//        queue.offer('f');
//        queue.offer('g');
//        while (queue.peek() != null){
//            System.out.println(queue.poll());
//        }


        Map<Integer,Character> map = new LinkedHashMap<>();
        map.put(3,'c');
        map.put(1,'a');
        map.put(2,'b');
        map.put(1,'b');

        Set<Map.Entry<Integer,Character>> set = map.entrySet();
         Iterator it = set.iterator();
         while (it.hasNext()){
             Map.Entry<Integer,Character> m = (Map.Entry<Integer, Character>) it.next();
             System.out.print(m.getKey());
             System.out.println(map.get(m.getKey()));

         }
    }
}