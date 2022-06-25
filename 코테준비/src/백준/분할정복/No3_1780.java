package 백준.분할정복;

import java.io.*;
import java.util.StringTokenizer;

public class No3_1780 {
    private static int minus = 0;
    private static int zero = 0;
    private static int plus = 0;

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

        getSquareNum(square, 0, 0, N);
        bw.write(minus + "\n" + zero + "\n" + plus);
        bw.flush();
        bw.close();
    }

    private static void getSquareNum(int[][] square, int row, int col, int N) {
        if (checkSquare(square, row, col, N)) {
            if (square[row][col] == -1)
                minus++;
            else if (square[row][col] == 0)
                zero++;
            else
                plus++;
        } else {
            getSquareNum(square, row, col, N / 3);
            getSquareNum(square, row, col + N / 3, N / 3);
            getSquareNum(square, row, col + N / 3 * 2, N / 3);

            getSquareNum(square, row + N / 3, col, N / 3);
            getSquareNum(square, row + N / 3, col + N / 3, N / 3);
            getSquareNum(square, row + N / 3, col + N / 3 * 2, N / 3);

            getSquareNum(square, row + N / 3 * 2, col, N / 3);
            getSquareNum(square, row + N / 3 * 2, col + N / 3, N / 3);
            getSquareNum(square, row + N / 3 * 2, col + N / 3 * 2, N / 3);
        }
    }

    private static boolean checkSquare(int[][] square, int row, int col, int N) {
        int num = square[row][col];

        for (int i = row; i < row + N; i++) {
            for (int j = col; j < col + N; j++) {
                if (square[i][j] != num)
                    return false;
            }
        }
        return true;
    }
}
