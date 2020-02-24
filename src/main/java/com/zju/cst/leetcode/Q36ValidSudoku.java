package com.zju.cst.leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author wulixz
 * @date 2/20/20 : 3:30 PM
 * @introduction :
 */
public class Q36ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        if (board.length == 0 || board.length != board[0].length) return false;
        boolean result = true;
        HashSet<String> hashSet = new HashSet<>();
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board.length; column++) {
                char number = board[row][column];
                if (number != '.') {
                    if (!hashSet.add(number + "in row" + row)
                            || !hashSet.add(number + "in column" + column)
                            || !hashSet.add(number + "in block" + row / 3 + "-" + column / 3)) {
                        return false;
                    }
                }
            }
        }

        return result;
    }
}

class Q36TestValidSudoku {
    public static void main(String[] args) {
        Q36ValidSudoku VSK = new Q36ValidSudoku();
        char[][] board = {
                {'2', '.', '.', '9', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '3', '.', '.', '.', '.', '.', '1'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'1', '.', '.', '.', '.', '.', '3', '.', '.'},
                {'.', '.', '.', '.', '2', '.', '6', '.', '.'},
                {'.', '9', '.', '.', '.', '2', '.', '7', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'8', '.', '.', '1', '.', '.', '.', '.', '.'}
        };

        boolean res = VSK.isValidSudoku(board);
        System.out.println(res);

//        HashSet<Integer> set = new HashSet<>();
//        boolean add3 = set.add(3);
//        boolean add2 = set.add(2);
//        boolean add1 = set.add(1);
//        boolean add1aganin = set.add(3);
//        System.out.println(add3);
//        System.out.println(add2);
//        System.out.println(add1);
//        System.out.println(add1aganin);
//        System.out.println(set.toString());


    }
}