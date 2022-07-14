package 백준.단계별로풀어보기.Lv25_그래프와순회;

import java.io.*;
import java.util.StringTokenizer;

public class No8_1012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int testCast = 0; testCast < T; testCast++) {
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int[][] square = new int[M][N];
            int result = 0;
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                square[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (search(i, j, N, M, square) > 0)
                        result++;
                }
            }
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
    }

    private static int search(int i, int j, int N, int M, int[][] square) {
        if (i < 0 || i >= M || j < 0 || j >= N)
            return 0;
        if (square[i][j] == 0)
            return 0;
        square[i][j] = 0;

        //up, down, left, right 탐색
        return 1 + search(i - 1, j, N, M, square) + search(i + 1, j, N, M, square)
                + search(i, j - 1, N, M, square) + search(i, j + 1, N, M, square);
    }
}
