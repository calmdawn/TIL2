package 백준.Lv21_분할정복;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class No_2740 {

    private static  StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] A = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++)
                A[i][j] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] B = new int[M][K];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < K; j++)
                B[i][j] = Integer.parseInt(st.nextToken());
        }

        getResult(A, B, M);

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }

    //
//    1 2   -1 -2  0
//    3 4    0  0  3
//    5 6
//
    private static void getResult(int[][] A, int[][] B,int M) {
        for (int i = 0; i < A.length; i++) {
            getLine(A[i], B, M);
            sb.append("\n");
        }
    }

    private static void getLine(int[] aLine, int[][] b,int M) {
        for (int i = 0; i < M; i++) {
            int sum = 0;
            for (int j = 0; j < b.length; j++) {
                sum = aLine[j] * b[i][j];
            }
            sb.append(sum).append(" ");
        }
    }

}
