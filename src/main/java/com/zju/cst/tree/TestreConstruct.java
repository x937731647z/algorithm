package com.zju.cst.tree;

public class TestreConstruct {
  public static void main(String[] args) {
      reConstruct re = new reConstruct();
      int[] pre = {1,2,4,3,5,6};
      int[] in = {4,2,1,5,3,6};
      TreeNode node =  re.reConstructBinaryTree(pre,in);
      //后序遍历

        System.out.println(node);
    //
  }
}
