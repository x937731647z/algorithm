package com.zju.cst.algorithm;

public class RebuildBinaryTreeTest {

	public static void main(String[] args) {
		int preorder[] = {1, 2, 4, 7, 3, 5, 6, 8};
		int inorder[] = {4, 7, 2, 1, 5, 3, 8, 6};
		RebuildBinaryTree rt = new RebuildBinaryTree();
		
		TreeNode treeNode = rt.reConstructBinaryTree(preorder, inorder);
		System.out.println(treeNode.right.left.val);
	}

}
