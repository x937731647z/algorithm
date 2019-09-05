package com.zju.cst.btree;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedBinaryTree implements BinaryTree {
  private Node root;

  LinkedBinaryTree() {}

  LinkedBinaryTree(Node node) {
    this.root = node;
  }

  @Override
  public int size() {
    System.out.println("二叉树的节点个数为： ");
    return this.size(root);
  }

  private int size(Node root) {
    if (root == null) {
      return 0;
    } else {
      int nl = size(root.leftChild);
      int nr = size(root.rightChild);
      return nl + nr + 1;
    }
  }

  @Override
  public boolean isEmpty() {
    return root == null;
  }

  @Override
  public int getHeight() {
    System.out.println("二叉树的高度为: ");
    return this.getHeight(root);
  }

  private int getHeight(Node root) {
    if (root == null) {
      return 0;
    } else {
      int nl = getHeight(root.leftChild);
      int nr = getHeight(root.rightChild);
      return nl > nr ? nl + 1 : nr + 1;
    }
  }

  @Override
  public Node findKey(int value) {
    return this.findkey(value, root);
  }

  private Node findkey(Object value, Node root) {
    if (root == null) {
      return null;
    } else if (root.value != null && root.value == value) {
      return root;

    } else {
      Node nl = findkey(value, root.leftChild);
      if (nl != null) {
        return nl;
      }
      Node nr = findkey(value, root.rightChild);
      if (nr != null) {
        return nr;
      }
    }
    return null;
  }

  @Override
  public void preOrderTraverse() {
    this.preOrderTraverse(root);
  }

  private void preOrderTraverse(Node root) {
    // 首先判读根节点 是否为空
    if (root != null) {
      // 输出根节点
      System.out.print(root.value + " ");
      // 查找左子树
      preOrderTraverse(root.leftChild);
      // 查找右子树
      preOrderTraverse(root.rightChild);
    }
  }

  @Override
  public void inOrderTeavere() {
    this.inOrderTeavere(root);
  }

  private void inOrderTeavere(Node root) {
    if (root != null) {
      // 先对左子树进行遍历
      inOrderTeavere(root.leftChild);
      // 输出根节点
      System.out.print(root.value + " ");
      // 对右子树进行遍历
      inOrderTeavere(root.rightChild);
    }
  }

  @Override
  public void postOrderTeavere() {
    this.postOrderTeavere(root);
  }

  @Override
  public void postOrderTeavere(Node root) {
    if (root != null) {
      // 先对左子树进行遍历
      postOrderTeavere(root.leftChild);
      // 对右子树进行遍历
      postOrderTeavere(root.rightChild);
      // 输出根节点
      System.out.print(root.value + " ");
    }
  }

  @Override
  public void inOrderByStack() {

  }

  @Override
  public void preOrderByStack() {}

  @Override
  public void postOrderByStack() {}

  @Override
  public void levelOrderByStack() {
    System.out.println("按照层次遍历（借助队列）: ");
    Queue<Node > queue = new LinkedList<>();
    if (root == null) return;
    queue.offer(root);
    while (queue.size() != 0 ){
        for (int i = 0 ; i < queue.size();i++){
            Node tmp = queue.poll();
            System.out.print(tmp.value + " ");
            if (tmp.leftChild != null)queue.offer(tmp.leftChild);
            if (tmp.rightChild != null)queue.offer(tmp.rightChild);

        }

    }





  }
}
