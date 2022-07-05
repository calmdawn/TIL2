package 백준.Lv16_동적계획법1;

import java.io.*;
import java.util.StringTokenizer;

public class No12_11053 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] dp = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && dp[j] + 1 > dp[i])
                    dp[i] = dp[j] + 1;
            }
        }
        int max = 0;
        for (int i = 0; i < N; i++)
            max = Math.max(max,dp[i]);

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }
}
