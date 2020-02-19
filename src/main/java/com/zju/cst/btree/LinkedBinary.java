package com.zju.cst.btree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wulixz
 * @date 11/21/19 : 2:48 PM
 * @introduction :
 */
public class LinkedBinary implements BinaryTree {

    Node root;

    public LinkedBinary() {
    }

    public LinkedBinary(Node root) {
        this.root = root;
    }

    @Override
    public int size() {
        System.out.println("the size of tree : ");
        return this.size(root);
    }
    private int size(Node root){
        if (root == null){
            return 0;
        }else {
            int nl = this.size(root.leftChild);
            int nr = this.size(root.rightChild);
            return nl + nr + 1;

        }
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public int getHeight() {
        System.out.println("the height of the tree is  : ");
        return this.getHeight(root);
    }

    private int getHeight(Node root) {
        if (root == null) {
            return 0;
        } else {
            int nl = this.getHeight(root.leftChild);
            int nr = this.getHeight(root.rightChild);
            return nl > nr ? nl + 1 : nr + 1;
        }
    }

    @Override
    public Node findKey(int value) {
        return null;
    }

    @Override
    public void preOrderTraverse() {
        if (root != null) {
            System.out.println("the result of left is :");
            preOrderTraverse(root);
            System.out.println();
        }
    }

    private void preOrderTraverse(Node root) {
        if (root != null) {
            // sout root
            System.out.print(root.value + " ");
            // sout left
            this.preOrderTraverse(root.leftChild);
            //sout right
            this.preOrderTraverse(root.rightChild);
        }
    }


    @Override
    public void inOrderTeavere() {
        if (root != null) {
            System.out.println("the result of mid is :");
            this.inOrderTeavere(root);
            System.out.println();
        }

    }

    private void inOrderTeavere(Node root) {
        if (root != null) {
            this.inOrderTeavere(root.leftChild);
            System.out.print(root.value + " ");
            this.inOrderTeavere(root.rightChild);
        }
    }


    @Override
    public void postOrderTeavere() {
        if (root != null) {
            System.out.println("the result of right is :");
            this.postOrderTeavere(root);
            System.out.println();
        }
    }

    private void postOrderTeavere(Node root) {
        if (root != null) {
            this.postOrderTeavere(root.leftChild);
            this.postOrderTeavere(root.rightChild);
            System.out.print(root.value + " ");
        }
    }

    @Override
    public void inOrderByStack() {

    }

    @Override
    public void preOrderByStack() {

    }

    @Override
    public void postOrderByStack() {

    }

    @Override
    public void levelOrderByStack() {
        if (root == null) return;
        Queue<Node> queue = new LinkedList();
        queue.add(root);
        while (queue.size() != 0){
            int time = queue.size();
            for (int i = 0 ; i < time; i ++){
                Node head = queue.poll();
                System.out.print(head.value + " ");
                if (head.leftChild != null)queue.add(head.leftChild);
                if (head.rightChild != null)queue.add(head.rightChild);

            }

        }
    }
}
