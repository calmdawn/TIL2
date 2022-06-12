package 백준.백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2_15650 {
    private static int[] numbers;
    private static boolean[] isUsed;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        numbers = new int[M];   //수열을 저장할 배열
        isUsed = new boolean[N + 1];    //사용한 자연수를 체크할 배열
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
            if (isUsed[num] == false) {
                numbers[len] = num;
                isUsed[num] = true;
                dfs(N, M, len + 1, num + 1);
                isUsed[num] = false;
            }
        }
    }
}
