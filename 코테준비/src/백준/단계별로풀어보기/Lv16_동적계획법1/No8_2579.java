package 백준.단계별로풀어보기.Lv16_동적계획법1;

import java.io.*;

public class No8_2579 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] stairs = new int[N + 1];
        int[] dp = new int[N + 1];
        for (int i = 1; i <= N; i++)
            stairs[i] = Integer.parseInt(br.readLine());

        dp[1] = stairs[1];
        if (N >= 2)
            dp[2] = stairs[1] + stairs[2];

        for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + stairs[i - 1]) + stairs[i];
        }

        bw.write(String.valueOf(dp[N]));
        bw.flush();
        bw.close();
    }
}
