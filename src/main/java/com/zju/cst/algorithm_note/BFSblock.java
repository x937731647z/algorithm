package com.zju.cst.algorithm_note;


import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author wulixz
 * @date 9/5/19 : 1:33 PM
 * @introduction : 找出矩阵中 1 的块
 */
public class BFSblock {
    int max = 100;
    //初始化调出接口
    boolean[][] inque = new boolean[max][max];
    //上下左右移动
    int[] Xarray = {-1, 1, 0, 0};
    int[] Yarray = {0, 0, -1, 1};

    public int initial(int[][] martix) {
        int ans = 0;
        for (int i = 0; i < martix.length; i++) {
            for (int j = 0; j < martix[0].length; j++) {
                if (martix[i][j] == 1 && inque[i][j] == false) {
                    ans++;
                    BFSearch(i, j, martix);
                }
            }
        }
        return ans;
    }

    //首先，写出判定方法
    public boolean judge(int x, int y, int[][] martix) {
        if (x >= martix.length || x < 0 || y < 0 || y >= martix[0].length) return false;
        if (martix[x][y] == 0 || inque[x][y] == true) return false;
        return true;

    }

    public void BFSearch(int x, int y, int[][] martix) {
        Queue<BFSblockNode> queue = new LinkedBlockingQueue<>();
        BFSblockNode node = new BFSblockNode();
        node.x = x;
        node.y = y;
        queue.offer(node);
        inque[x][y] = true;
        while (!queue.isEmpty()) {
            BFSblockNode top = queue.poll();
            int topx = top.x;
            int topy = top.y;
            for (int i = 0; i < Xarray.length; i++) {
                int NewX = topx + Xarray[i];
                int NewY = topy + Yarray[i];
                if (judge(NewX, NewY, martix)) {
                    node.x = NewX;
                    node.y = NewY;
                    queue.offer(node);
                    inque[NewX][NewY] = true;
                }
            }
        }
    }
}
