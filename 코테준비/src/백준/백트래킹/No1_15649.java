package 백준.백트래킹;

import java.io.*;
import java.util.StringTokenizer;

public class No1_15649 {
    public static int N, M;
    public static int[] numbers;
    public static boolean[] useNum;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        numbers = new int[M];
        useNum = new boolean[N + 1];
        int len = 0;

        dp(len);
        System.out.println(sb);
    }

    private static void dp(int len) {
        if (len == M) {
            for (int i = 0; i < numbers.length; i++)
                sb.append(numbers[i]).append(" ");
            sb.append("\n");
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (useNum[i] == false) {
                numbers[len] = i;
                useNum[i] = true;
                dp(len + 1);
                useNum[i] = false;
            }
        }
    }
}
