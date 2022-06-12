package 백준.백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No5_9663 {

    private static int N;
    private static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        boolean[][] board = new boolean[N][N];

        int col = 0;
        int count = 0;
        getQueenCount(board, col, count);
        System.out.println(result);
    }

    private static void getQueenCount(boolean[][] board, int col, int count) {
        if (count == N) {
            result++;
            return;
        }
        for (int width = 0; width < board[col].length; width++) {//up방향 체크, left방향 체크, 왼쪽위방향 대각선 체크
            if (checkUp(col, width, board) && checkWidth(col, width, board)
                    && checkUpLeft(col, width, board) && checkUpRight(col, width, board)) {
                board[col][width] = true;
                getQueenCount(board, col + 1, count + 1);
                board[col][width] = false;
            }
        }
    }
    private static boolean checkUpRight(int i, int j, boolean[][] board) {
        int up = i, right = j;
        while (up >= 0 && right < board.length) {
            if (board[up][right] == true)
                return false;
            up--;
            right++;
        }
        return true;
    }

    private static boolean checkUpLeft(int i, int j, boolean[][] board) {
        int up = i, left = j;
        while (up >= 0 && left >= 0) {
            if (board[up][left] == true)
                return false;
            up--;
            left--;
        }
        return true;
    }

    private static boolean checkWidth(int i, int j, boolean[][] board) { //가로에 퀸이 있는경우 false
        for (int line = 0; line < board[i].length; line++) {
            if (board[i][line] == true)
                return false;
        }
        return true;
    }

    private static boolean checkUp(int i, int j, boolean[][] board) { //위쪽에 퀸이 있는경우 false
        for (int up = i; up >= 0; up--) {
            if (board[up][j] == true)
                return false;
        }
        return true;
    }
}

