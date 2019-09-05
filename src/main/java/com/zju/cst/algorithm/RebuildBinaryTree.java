package com.zju.cst.algorithm;

public class RebuildBinaryTree {
//	//pre数组为先序，in数组为中序
//	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
//		//找出空的情况
//		if(pre.length == 0 || in.length == 0) {
//			return null;
//		}
//		return ConstructBinaryTree(pre, 0, pre.length -1, in, 0 ,in.length -1);		
//	}
//
//	public TreeNode ConstructBinaryTree(int [] pre,int prestart,int preend, int [] in, int instart, int inend ) {
//		// TODO Auto-generated method stub
//		//递归的终止条件
//		if(prestart > preend || instart > inend) {
//			return null;
//		}
//		//找出根节点
//		TreeNode root = new TreeNode(pre[prestart]);
//		for(int i = instart; i<= inend; i++) {
//			if(in[i] == pre[prestart]) {
//				root.left = ConstructBinaryTree(pre , prestart + 1, i-instart + prestart,in,instart, i-1 );
//				root.right = ConstructBinaryTree(pre,prestart + i-instart +1,preend,in,i+1,inend);
//			}
//		}
//	
//		return root;
//	}
	
	int[] pre;
	int[] in;
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        this.pre = pre;
		this.in = in;
		return this.constructTree(0, pre.length -1, 0, in.length-1);
    }
	TreeNode constructTree(int preLeft, int preRight, int inLeft, int inRight){
		if(inLeft > inRight)
			return null;
		if(inLeft == inRight){
			TreeNode node = new TreeNode(in[inLeft]);
			node.left = null;
			node.right = null;
			return node;
		}
		
		int index = findIndexOfArrayIn(pre[preLeft]);
		TreeNode Node = new TreeNode(in[index]);
		int length_left = index - inLeft;
		Node.left = constructTree(preLeft + 1, preLeft + length_left, inLeft, index - 1);
		Node.right = constructTree(preLeft + length_left + 1, preRight, index + 1, inRight);
		return Node;
			
	}
	int findIndexOfArrayIn(int key){
		for(int i = 0; i < in.length; i++){
			if(in[i] == key)
				return i;
		}
		return 0;
	}
}

 