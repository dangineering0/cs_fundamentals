package com.company.algo;

import java.util.*;

/**
 * Created by dangineering on 7/9/16.
 */
public class Sudoku {

    char[][] board;

    public boolean isValidSudoku(char[][] board) {
        this.board = board;

//        // check rows
//        for (int i = 0; i<board.length; i++) {
//            if (hasDuplicates(board[i])) {
//                return false;
//            }
//        }
//
//        // check columns
//
//
//
//        // check boxes

        // keep a boolean array of columns and rows and
        return false;
    }


    private boolean hasDuplicates(char[] list) {
        Set<Character> set = new HashSet<>();
        for (char i : list) {
            if (set.contains(i)) {
                return true;
            } else {
                set.add(i);
            }
        }
        return false;
    }

    private List<Integer> convertToList(int x, int y) {
        List<Integer> ans = new ArrayList<>();
        for (int i = x; i<3; i++) {
            for (int k = y; k<3; k++) {
                char c = board[i][k];
                if (c != '.') {
                    ans.add((int)c-'0');
                }
            }
        }
        return ans;
    }
}
