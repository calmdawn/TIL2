package 백준.Lv21_분할정복;

import java.io.*;
import java.util.StringTokenizer;

public class No1_2630 {
    private static int white = 0;
    private static int blue = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] square = new int[N][N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                square[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        getSquareColor(square, 0, 0, N);
        bw.write(white + "\n" + blue);
        bw.flush();
        bw.close();
    }

    private static void getSquareColor(int[][] square, int row, int col, int N) {
        if (checkSquare(square, row, col, N)) {
            if (square[row][col] == 0)
                white++;
            else
                blue++;
        } else {
            getSquareColor(square, row, col, N / 2);
            getSquareColor(square, row + N / 2, col, N / 2);
            getSquareColor(square, row, col + N / 2, N / 2);
            getSquareColor(square, row + N / 2, col + N / 2, N / 2);
        }
    }

    private static boolean checkSquare(int[][] square, int row, int col, int N) {
        int color = square[row][col];
        boolean isCheck = true;
        for (int i = row; i < row + N; i++) {
            for (int j = col; j < col + N; j++) {
                if (square[i][j] != color)
                    return false;
            }
        }
        return isCheck;
    }
}
