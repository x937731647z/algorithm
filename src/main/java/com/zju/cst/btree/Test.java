package com.zju.cst.btree;

public class Test {
	public static void main(String[] args) {
		//创建一个二叉树
		Node node5 = new Node(5,null,null);
		Node node4 = new Node(4,null,node5);
		Node node3 = new Node(3,null,null);
		Node node7 = new Node(7,null,null);
		Node node6 = new Node(6,null,node7);
		Node node2 = new Node(2,node3,node6);
		Node node1 = new Node(1,node4,node2);
		
		BinaryTree btree = new LinkedBinaryTree(node1);	
		
		//判断二叉树 是否为空
		System.out.println(btree.isEmpty());
		
		//先序遍历递归
		btree.preOrderTraverse();
		
		//中序遍历递归
//		System.out.println("先序遍历递归结果为：");
		System.out.println("");
		btree.inOrderTeavere();
		
		//后序遍历递归
		System.out.println("");
		btree.postOrderTeavere();

		//中序遍历非递归（借助栈）
		System.out.println("");
		btree.inOrderByStack();

		//按照层次遍历（借助队列）
		System.out.println("");
		btree.levelOrderByStack();

		//在二叉树中查找某个值

		//二叉树的高度
		System.out.println("");
		System.out.println(btree.getHeight());

		//二叉树的结点数量
		System.out.println("");
		System.out.println(btree.size());

		//在二叉树中获取某个值的
		System.out.println("在二叉树中获取某个值的");
		System.out.print(btree.findKey(4));

	}
}
