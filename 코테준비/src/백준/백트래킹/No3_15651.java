package 백준.백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No3_15651 {
    private static int[] numbers;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        numbers = new int[M];   //수열을 저장할 배열
        int len = 0;
        dfs(N, M, len);
        System.out.println(sb);
    }

    private static void dfs(int N, int M, int len) {
        if (len == M) {
            for (int num : numbers)
                sb.append(num + " ");
            sb.append("\n");
            return;
        }
        for (int num = 1; num <= N; num++) {
            numbers[len] = num;
            dfs(N, M, len + 1);
        }
    }
}
