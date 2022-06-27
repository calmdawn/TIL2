package 백준.Lv9_재귀;

import java.io.*;
import java.util.Arrays;

public class No4_2447 {

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        char[][] board = new char[N][N];

        for (int i = 0; i < N; i++)
            Arrays.fill(board[i], '*');

        setBlank(board, 3);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                sb.append(board[i][j]);
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void setBlank(char[][] board, int startN) {
        if (startN > N)
            return;

        int row = startN / 3;
        int col = startN / 3;

        setDown(board, row, col, startN);
        setBlank(board, startN * 3);
    }

    private static void setDown(char[][] board, int row, int col, int startN) {
        if (row < N) {
            for (int i = row; i < row + startN / 3; i++) {
                board[i][col] = ' ';
                setRight(board, i, col, startN);
            }
            setDown(board, row + startN, col, startN);
        }
    }

    private static void setRight(char[][] board, int row, int col, int startN) {
        if (col < N) {
            for (int j = col; j < col + startN / 3; j++) {
                board[row][j] = ' ';
            }
            setRight(board, row, col + startN, startN);
        }
    }
}
