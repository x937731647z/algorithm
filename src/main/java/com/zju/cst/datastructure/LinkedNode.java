package com.zju.cst.datastructure;

/**
 * @author wulixz
 * @date 10/21/19 : 4:50 PM
 * @introduction :
 */
public class LinkedNode {
    LinkedNode next;
    Object data;
    public LinkedNode(Object data) {
        this.data = data;
    }
    public LinkedNode(LinkedNode next, Object data) {
        this.next = next;
        this.data = data;
    }
    public LinkedNode(){}


}
