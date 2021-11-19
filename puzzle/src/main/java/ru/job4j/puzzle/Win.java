package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        for (int cell = 0; cell < board.length; cell++) {
            if (monoHorizontal(board, cell) || monoVertical(board, cell)) {
                return true;
            }
        }
        return false;
    }

    public static boolean monoHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int cell : board[row]) {
            if (cell != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(int[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

}
