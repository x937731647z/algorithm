package com.zju.cst.algorithm;

public class GetNextNode {
	public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
		//判断空节点
		if(pNode.left == null && pNode.right == null && pNode.next == null) {
			return null;
		}
		//如果该节点有右子树，返回右子树最左边的树
		if(pNode.right != null) {//该节点有右子树
			
			TreeLinkNode rightnode = pNode.right;
			while(rightnode.left != null) {
				rightnode = rightnode.left;
			}
			return rightnode;
//			
//			while(rightnode.left ==null) {		
//				if(rightnode.right == null) {
//					return rightnode;
//				}else {
//					rightnode = rightnode.right;	
//				}
//			}
//			return rightnode.left;		
		}
		
		//如果该节点没有右子树，分2种情况
		//第一种，如果该节点是父节点的左子树节点，返回父节点
//		if(pNode.equals(pNode.next.left) ) {
//			return pNode.next;
//		}
//		//第二种，该节点是父节点的右节点，找到父节点是左子树的节点的父节点。
//		if(!pNode.equals(pNode.next.left)) {
//			TreeLinkNode node = pNode.next;
//			while( !node.equals(node.next.left) ) {
//				pNode = node.next;
//			}
//			return node;
//		}
		while(pNode.next != null){
            TreeLinkNode node = pNode.next;
            if(pNode == node.left){return node;}
            pNode = node;
        }
        return null;
    }
}
