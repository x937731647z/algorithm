package com.zju.cst.HuaWei;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int square = 1;
        char [][] arr = new char[row][];
        for (int i = 0 ;i< row; i++){
            String content= scanner.next();
            arr[i] = content.toCharArray();
        }

        Main solution = new Main();
        square = solution.search_matrix(arr);
        System.out.println(square);
    }
  public int search_matrix(char [][] matrix){
      if(matrix.length == 0)return 0;
      int[][]matrix_arr = new int[matrix.length][matrix[0].length];
      for(int i = 0;i < matrix.length;i++)
          matrix_arr[i][0] = matrix[i][0]-'0';
      for(int j = 0;j < matrix[0].length;j++)
          matrix_arr[0][j] = matrix[0][j]-'0';

    for (int i = 1; i < matrix.length; i++) {
      for (int j = 1; j < matrix[0].length; j++)
        if (matrix[i][j] != '0') {
          matrix_arr[i][j] =
              Math.min(
                  Math.min(matrix_arr[i - 1][j], matrix_arr[i][j - 1]), matrix_arr[i - 1][j - 1]);
          matrix_arr[i][j] += 1;
        }
        }
      int max = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++)
          max = Math.max(matrix_arr[i][j], max);
      }
      return max*max;
  }
}
