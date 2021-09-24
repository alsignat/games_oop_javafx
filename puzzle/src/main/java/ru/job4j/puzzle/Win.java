package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;

        for (int row = 0; row < board.length; row++) {
            int totalRow = 0;
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == 1) {
                    totalRow++;
                }
            }
            if (totalRow == board[row].length) {
                return true;
            }
        }

        for (int col = 0; col < board[0].length; col++) {
            int totalCol = 0;
            for (int row = 0; row < board.length; row++) {
                if (board[row][col] == 1) {
                    totalCol++;
                }
            }
            if (totalCol == board.length) {
                return true;
            }
        }
        return rsl;
    }
}
