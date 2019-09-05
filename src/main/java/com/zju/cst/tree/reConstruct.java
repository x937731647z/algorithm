package com.zju.cst.tree;

public class reConstruct {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre == null || in == null)return null;
        int prestart = 0;
        int preend = pre.length -1;
        int instart = 0;
        int inend = in.length-1;
        TreeNode treeNode = recon(pre, prestart, preend, in,instart,inend);
        return treeNode;
    }
    private TreeNode recon(int [] pre, int prestart, int preend, int [] in, int instart, int inend){
        //找到停止递归的条件
        if (prestart > preend || instart > inend){
            return null;
        }
        TreeNode root = new TreeNode(pre[prestart]);
        for (int i = instart ; i< inend;i++){
            if (in[i] == pre[prestart]){
                //对于左边来说
                root.left = recon(pre,prestart + 1,prestart + i- instart, in, instart ,i-1 );
                //对于右边来说
                root.right = recon(pre,prestart +i- instart+1,preend,in, i+1 ,inend );
            }
        }
        return root;

    }
}
