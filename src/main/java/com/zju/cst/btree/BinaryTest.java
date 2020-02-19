package com.zju.cst.btree;

/**
 * @author wulixz
 * @date 11/21/19 : 2:49 PM
 * @introduction :
 */
public class BinaryTest {
    public static void main(String[] args) {
        //创建一个二叉树
        Node node5 = new Node(5,null,null);
        Node node4 = new Node(4,null,node5);
        Node node3 = new Node(3,null,null);
        Node node7 = new Node(7,null,null);
        Node node6 = new Node(6,null,node7);
        Node node2 = new Node(2,node3,node6);
        Node node1 = new Node(1,node4,node2);

        BinaryTree btree = new LinkedBinary(node1);

        //判断二叉树 是否为空
        System.out.println(btree.isEmpty());

        //先序遍历递归
        btree.preOrderTraverse();
        btree.inOrderTeavere();
        btree.postOrderTeavere();

        System.out.println(btree.getHeight());
        System.out.println(btree.size());
        btree.levelOrderByStack();
    }
}
