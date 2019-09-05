package com.zju.cst.algorithm;

import java.util.ArrayList;

public class printMatrixTest {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
//		int[][] matrix = { { 1, 2, 3, 4, 5 } };
//		int[][] matrix = { { 1 } };
		printMatrixTest printMatrixTest = new printMatrixTest();
		System.out.println(printMatrixTest.printMatrix(matrix));
	}

	public ArrayList<Integer> printMatrix(int[][] matrix) {

		ArrayList<Integer> arraylist = new ArrayList<>();
		int row = matrix[0].length;
		int col = matrix.length;

		int left = 0, right = row - left - 1, top = 0, botton = col - top - 1;

		while (left <= right && top <= botton) {
			// 上面，从左到右
			if (left <= right && top <= botton) {
				for (int j = left; j <= right; j++) {
					arraylist.add(matrix[top][j]);
				}
			}
			top++;
			// 右面，从上到下
			if (left <= right && top <= botton) {
				for (int i = top; i <= botton; i++) {
					arraylist.add(matrix[i][right]);
				}

			}
			right--;
			// 下面，从右到左
			if (left <= right && top <= botton) {
				for (int j = right; j >= left; j--) {
					arraylist.add(matrix[botton][j]);
				}

			}
			botton--;
			// 左面，从下到上
			if (left <= right && top <= botton) {
				for (int i = botton; i >= top; i--) {
					arraylist.add(matrix[i][left]);
				}
			}
			left++;
		}

		return arraylist;
	}

}
