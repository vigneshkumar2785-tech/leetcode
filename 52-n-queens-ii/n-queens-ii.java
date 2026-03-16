import java.util.*;

class Solution {
    public int totalNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        place(board, 0, result);
        return result.size();
    }

    public void place(char[][] board, int row, List<List<String>> result) {
        if (row == board.length) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                list.add(new String(board[i]));
            }
            result.add(list);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';     // Place Queen
                place(board, row + 1, result); // Recurse to next row
                board[row][col] = '.';     // Backtrack (remove Queen)
            }
        }
    }

    public boolean isSafe(char[][] board, int row, int col) {
        // 1. Check vertical column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // 2. Check top-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // 3. Check top-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }
}