package 백준.단계별로풀어보기.Lv14_정수론및조합론;

import java.io.*;
import java.util.StringTokenizer;

public class No9_1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int testCase = 0; testCase < T; testCase++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            bw.write(getCase(N, M) + "\n");
        }

        bw.flush();
        bw.close();
    }

    private static long getCase(int N, int M) {
        long up = 1;
        long down = 1;
        while (N > 0) {
            up = up * M;
            if (up % N == 0)
                up = up / N;
            else
                down = down * N;
            M--;
            N--;
        }
        return (up / down);
    }
}