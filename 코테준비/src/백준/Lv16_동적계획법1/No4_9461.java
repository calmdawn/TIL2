package 백준.Lv16_동적계획법1;

import java.io.*;

public class No4_9461 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        long[] memo = new long[101];
        memo[1] = 1;
        memo[2] = 1;
        memo[3] = 1;
        memo[4] = 2;
        memo[5] = 2;

        int getCaseIdx = 5;
        for (int testCase = 0; testCase < T; testCase++) {
            int N = Integer.parseInt(br.readLine());
            if (N <= getCaseIdx) {
                bw.write(memo[N] + "\n");
            } else {
                for (int i = getCaseIdx; i <= N; i++) {
                    memo[i] = memo[i - 1] + memo[i - 5];
                }
                bw.write(memo[N] + "\n");
                getCaseIdx = N;
            }
        }
        bw.flush();
        bw.close();
    }
}
