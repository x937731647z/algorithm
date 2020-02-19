package com.zju.cst.algorithm_note;


import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author wulixz
 * @date 2/9/20 : 3:33 PM
 * @introduction :
 */
public class HaffmanTree {
    public static void main(String[] args) {
        HaffmanTree tree = new HaffmanTree();
        int[] arr = {13, 7, 8, 3, 29, 6, 1};
        HaffmanNode node  = tree.HaffmanBuild(arr);
        node.preSort(node);
    }

    public HaffmanNode HaffmanBuild(int [] arr){
        List<HaffmanNode> nodes = new ArrayList();
        for (int value : arr
        ) {
            nodes.add(new HaffmanNode(value));
        }
        System.out.println(nodes);

        //make a sort
        Collections.sort(nodes);
        System.out.println(nodes);

        while (nodes.size() > 1){
            HaffmanNode left = nodes.get(0);
            HaffmanNode right = nodes.get(1);
            HaffmanNode parent = new HaffmanNode(left.value + right.value);
            parent.left = left;
            parent.right = right;
            nodes.remove(right);
            nodes.remove(left);
            nodes.add(parent);
            Collections.sort(nodes);
        }
        return nodes.get(0);
    }
}

class HaffmanNode implements Comparable<HaffmanNode>{
    HaffmanNode left;
    HaffmanNode right;
    int value;

    public void preSort(HaffmanNode root){
        if (root != null){
            System.out.println(root);
            if (root.left != null){
                this.preSort(root.left);
            }
            if (root.right != null){
                this.preSort(root.right);
            }

        }else {
            System.out.println("it is a null Haffman Node");
        }
    }

    HaffmanNode(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return
                " value=" + value;
    }

    @Override
    public int compareTo(@NotNull HaffmanNode o) {
        return this.value - o.value;
    }
}