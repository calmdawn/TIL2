package 백준.단계별로풀어보기.Lv21_분할정복;

import java.io.*;
import java.util.StringTokenizer;

public class No6_2740 {

    private static StringBuilder sb = new StringBuilder();
    private static int N;
    private static int M;
    private static int K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int[][] A = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++)
                A[i][j] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int[][] B = new int[M][K];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < K; j++)
                B[i][j] = Integer.parseInt(st.nextToken());
        }

        getResult(A, B);

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }

    private static void getResult(int[][] A, int[][] B) {
        for (int i = 0; i < N; i++) {
            getLine(A[i], B);
            sb.append("\n");
        }
    }

    private static void getLine(int[] aLine, int[][] b) {
        for (int i = 0; i < K; i++) {
            int sum = 0;
            for (int j = 0; j < M; j++) {
                sum = sum + aLine[j] * b[j][i];
            }
            sb.append(sum).append(" ");
        }
    }

}
