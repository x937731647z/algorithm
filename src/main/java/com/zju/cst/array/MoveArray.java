package com.zju.cst.array;

public class MoveArray {
  public static void main(String[] args) {
    //
     int[][] matrix ={
             {9,9,4},
             {6,6,8},
             {2,1,1}
                        };

    System.out.println(longestDP(matrix));
  }


    public static int longestDP(int[][] matrix) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int max = 0;
        int dp[][] = new int[matrix.length][matrix[0].length];   //缓存矩阵

        for (int row = 0; row < matrix.length; row++) {
        for (int col = 0; col < matrix[0].length; col++) {
            max = Math.max(max, processDP(matrix, dp, row, col));  //获取总的最长递增路径
        }
    }
        return max;
}

    private static int processDP(int[][] matrix, int[][] dp, int row, int col) { //求当前位置最长的递增路径
        if (dp[row][col] == 0) {    //若该值没有计算过，则计算当前最长递增路径
            dp[row][col] = 1;       // 原地不动的长度
            if (row > 0 && matrix[row - 1][col] > matrix[row][col]) {      //向上移动时
                dp[row][col] = Math.max(dp[row][col], processDP(matrix, dp, row - 1, col) + 1);
            }
            if (col > 0 && matrix[row][col - 1] > matrix[row][col]) {      //向左移动时
                dp[row][col] = Math.max(dp[row][col], processDP(matrix, dp, row, col - 1) + 1);
            }
            if (row < matrix.length - 1 && matrix[row + 1][col] > matrix[row][col]) { //向下移动时
                dp[row][col] = Math.max(dp[row][col], processDP(matrix, dp, row + 1, col) + 1);
            }
            if (col < matrix[0].length - 1 && matrix[row][col + 1] > matrix[row][col]) {   //向右移动时
                dp[row][col] = Math.max(dp[row][col], processDP(matrix, dp, row, col + 1) + 1);
            }
        }
        return dp[row][col];   //返回当前位置的最长递增路径
    }
}
