package com.zju.cst.btree;
/**
 * 二叉树的接口
 * 可以有不同的实现类，每个类可以使用不同的存储结构，比如顺序结构，链式结构
 * @author dell
 *
 */
public interface BinaryTree {
	/**
	 * 树结点数量
	 * @return
	 */
	public int size();
	
	/**
	 * 是否为空树
	 * @return
	 */
	public boolean isEmpty();
	
	public int getHeight();
	
	public Node findKey(int value);//查找
	/**
	 * 前序递归遍历
	 */
	public void preOrderTraverse();
	
	/**
	 * 中序递归遍历
	 */
	public void inOrderTeavere();
	
	/**
	 * 后序递归遍历
	 */
	public void postOrderTeavere();
	/**
	 * 后序递归遍历操作
	 * @param node  树根结点
	 */
	public void postOrderTeavere(Node node);
	
	/**
	 * 中序遍历非递归操作
	 */
	public void inOrderByStack();
	/**
	 * 先序遍历非递归操作
	 */
	public void preOrderByStack();
	/**
	 * 后序遍历非递归操作
	 */
	public void postOrderByStack();
	/**
	 * 按层次遍历二叉树
	 */
	public void levelOrderByStack();
	
	
}
