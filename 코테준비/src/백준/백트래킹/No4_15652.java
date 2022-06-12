package 백준.백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No4_15652 {
    private static int[] numbers;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        numbers = new int[M];   //수열을 저장할 배열
        int len = 0;
        int startNum = 1;
        dfs(N, M, len, startNum);
        System.out.println(sb);
    }

    private static void dfs(int N, int M, int len, int startNum) {
        if (len == M) {
            for (int num : numbers)
                sb.append(num + " ");
            sb.append("\n");
            return;
        }
        for (int num = startNum; num <= N; num++) {
            numbers[len] = num;
            if (len == 0)
                dfs(N, M, len + 1, startNum);
            else if (numbers[len - 1] <= numbers[len])
                dfs(N, M, len + 1, startNum);
        }
    }
}
