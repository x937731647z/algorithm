package com.zju.cst.algorithm;

import com.zju.cst.list.ArrayList;

/**
 * @author wulixz
 * @date 10/24/19 : 5:09 PM
 * @introduction :
 */
public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode resnode = head ;
        ListNode newnode = head;
        ArrayList arrayList = new ArrayList();
        while (resnode!= null){
            arrayList.add(resnode.val);
            resnode =  resnode.next;
        }
        ArrayList newlist = new ArrayList();
        for (int i = 0 ; i < arrayList.size()-1; i += 2){

            newlist.add(arrayList.get(i+1));
            newlist.add(arrayList.get(i));
        }
        for (int i = 0 ; i < newlist.size();i++){
            newnode.val = (int)newlist.get(i);
            newnode = newnode.next;
        }
        return head;
    }
}
