package com.zju.cst.leetcode;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @auther wulixz
 * @date 2020/2/22 3:48
 * @level hard   it is a good example to understand the Recursion, we cannot use set like Q36 to make a judge,
 *        because, we cannot recover the set like what it was.
 * @desc
 * @example
 * @solution
 * @standard
 */
public class Q37SudokuSolver {
    public void solveSudoku(char[][] board) {
        if (board == null || board.length == 0) return;
        solve(board);
    }
    public boolean solve(char[][] board) {
        for (int i = 0 ; i < board.length; i ++){
            for (int j = 0 ; j < board[0].length; j ++){
                char value = board[i][j];
                if (value == '.'){
                    for (char insert = '1'; insert <= '9' ;insert ++){
                        if (isValid(board,i,j,insert)){
                            board[i][j] = insert;
                            if (solve(board)){
                                return true;
                            }
                            else {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int row, int col, char c) {

//        if (!set.add("row"+row+"has"+c)  || !set.add("column"+col+"has"+c) || !set.add("block row"+row/3+"column"+col/3+"has"+c))return false;
        for (int i = 0; i < 9; i++) {
            if (board[i][col] != '.' && board[i][col] == c) return false;
            if (board[row][i] != '.' && board[row][i] == c) return false;
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] != '.' && board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
                return false;
        }
        return true;
    }


}

class Q37TestSudokuSolver {
    public static void main(String[] args) {
        Q37SudokuSolver sudokuSolver = new Q37SudokuSolver();
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '.', '9'}
        };
        sudokuSolver.solveSudoku(board);

        for (char[] row : board
                ) {
            System.out.println(Arrays.toString(row));
        }
    }
}