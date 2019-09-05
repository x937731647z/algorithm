package com.zju.cst.interview;

public class MaxSumofMatrix {

  public static void main(String[] args) {
    // 最大子矩阵的累加和
    int matrix[][] = {{0, -2, -7}, {9, 2, -6}, {-4, 1, -4}, {-1, 8, 0}};
    maxSum(matrix);
  }

  public static void maxSum(int matrix[][]) {
    if (matrix == null || matrix.length == 0) return;
    int max = 0;
    int col = matrix[0].length, row = matrix.length;
    for (int i = 0; i < row; i++) {
      int arr[] = new int[col];
      for (int j = i; j < row; j++) {
        // 遍历所有的子行
        for (int k = 0; k < col; k++) {
          arr[k] += matrix[j][k];
          // 将每子行的值进行相加然后利用子数组的最大和就可以求出子矩阵的最大和
        }
        max = Math.max(maxSum(arr), max);
        // 求出数组的子数组和最大值
      }
    }
    System.out.println(max);
  }

  public static int maxSum(int arr[]) {
    int max = 0, sum = 0;
    for (int i = 0; i < arr.length; i++) {
      if (sum <= 0) {
        sum = arr[i];
      } else {
        sum += arr[i];
      }
      max = Math.max(sum, max);
    }
    return max;
  }
}
