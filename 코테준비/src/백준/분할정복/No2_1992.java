package 백준.분할정복;

import java.io.*;
import java.util.StringTokenizer;

public class No2_1992 {

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] square = new int[N][N];
        String str;
        for (int i = 0; i < N; i++) {
            str = br.readLine();
            for (int j = 0; j < N; j++) {
                square[i][j] = str.charAt(j) - '0';
            }
        }

        getResult(square, 0, 0, N);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void getResult(int[][] square, int row, int col, int N) {

        if (checkSquare(square, row, col, N)) {
            sb.append(square[row][col]);
            return;
        }
        sb.append("(");
        getResult(square, row, col, N / 2);  //1사분면
        getResult(square, row, col + N / 2, N / 2);  //2사분면
        getResult(square, row + N / 2, col, N / 2);  //3사분면
        getResult(square, row + N / 2, col + N / 2, N / 2);  //4사분면
        sb.append(")");
    }

    private static boolean checkSquare(int[][] square, int row, int col, int N) {
        int color = square[row][col];

        for (int i = row; i < row + N; i++) {
            for (int j = col; j < col + N; j++) {
                if (color != square[i][j])
                    return false;
            }
        }
        return true;
    }
}
