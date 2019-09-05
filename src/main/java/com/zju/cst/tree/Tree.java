package com.zju.cst.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    TreeNode last;
    TreeNode nlast;

    public void printTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        TreeNode last = root;
        TreeNode nlast = root;

        while (queue.peek() != null){
            TreeNode t = queue.peek();
            System.out.print(queue.poll().val + " ");
            if (t.left != null){
                queue.offer(t.left);
                nlast = t.left;
            }
            if (t.right != null){
                queue.offer(t.right);
                nlast = t.right;
            }
            if (last == t){
                System.out.println();
                last = nlast;
            }
        }


    }

    public static void main(String[] args) {
        // 构建二叉树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(8);
        Tree test = new Tree();
        test.printTree(root);
    }
}
