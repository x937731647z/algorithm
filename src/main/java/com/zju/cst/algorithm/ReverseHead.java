package com.zju.cst.algorithm;

/**
 * @author wulixz
 * @date 10/25/19 : 1:36 PM
 * @introduction :
 */
public class ReverseHead {
    public void reversetList(HeroNode head) {
        if (head == null || head.next.next == null) {
            return;
        }

        HeroNode cur = head.next;
        HeroNode next = null;
        HeroNode ReNode = new HeroNode(0, "");

        while (cur != null) {
            next = cur.next;
            cur.next = ReNode.next;
            ReNode.next = cur;
            cur = next;
        }
        head.next = ReNode.next;
    }
}
class HeroNode{
    int index;
    String name;
    HeroNode next;

    public HeroNode(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroNode getNext() {
        return next;
    }

    public void setNext(HeroNode next) {
        this.next = next;
    }
}


