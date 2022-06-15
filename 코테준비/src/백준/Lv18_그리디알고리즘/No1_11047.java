package 백준.Lv18_그리디알고리즘;

import java.io.*;
import java.util.StringTokenizer;

public class No1_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] coins = new int[N];
        int min = 0;

        for (int i = 0; i < coins.length; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        for (int i = N - 1; i >= 0; i--) {
            if (coins[i] <= K) {
                min = min + K / coins[i];
                K = K % coins[i];
                if (K == 0)
                    break;
            }
        }

        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
    }
}
