package com.zju.cst.sort;

import com.zju.cst.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class TestLCA {
  public static void main(String[] args) {
      TreeNode node9 = new TreeNode(4);
      TreeNode node8 = new TreeNode(7);
      TreeNode node5 = new TreeNode(2,node8,node9);
      TreeNode node4 = new TreeNode(6);
      TreeNode node2 = new TreeNode(5,node4,node5);
      TreeNode node6 = new TreeNode(0);
      TreeNode node7 = new TreeNode(8);
      TreeNode node3 = new TreeNode(1,node6,node7);
      TreeNode root = new TreeNode(3,node2,node3);

      TestLCA testLCA = new TestLCA();
      TreeNode value = testLCA.lowestCommonAncestor(root,node2,node9);
     System.out.println(value.val);
  }

    private TreeNode ans;

    public TestLCA() {
        // Variable to store LCA node.
        this.ans = null;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Traverse the tree
        this.recurseTree(root, p, q);
        return this.ans;
    }

    private boolean recurseTree(TreeNode currentNode, TreeNode p, TreeNode q) {


        // If reached the end of a branch, return false.
        if (currentNode == null) {
            return false;
        }

        // Left Recursion. If left recursion returns true, set left = 1 else 0

        int left = this.recurseTree(currentNode.left, p, q) ? 1 : 0;

        // Right Recursion
        int right = this.recurseTree(currentNode.right, p, q) ? 1 : 0;

        // If the current node is one of p or q
        int mid = (currentNode == p || currentNode == q) ? 1 : 0;


        // If any two of the flags left, right or mid become True
        if (mid + left + right >= 2) {
            this.ans = currentNode;
        }

        // Return true if any one of the three bool values is True.
        return (mid + left + right > 0);
    }

}
