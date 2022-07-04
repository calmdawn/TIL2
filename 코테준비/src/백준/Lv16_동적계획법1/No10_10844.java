package 백준.Lv16_동적계획법1;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No10_10844 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] memo = new int[N][10];

        memo[0][0] = 0;
        memo[0][1] = 1;
        memo[0][2] = 1;
        memo[0][3] = 1;
        memo[0][4] = 1;
        memo[0][5] = 1;
        memo[0][6] = 1;
        memo[0][7] = 1;
        memo[0][8] = 1;
        memo[0][9] = 1;

        for (int i = 1; i < N; i++) {
            memo[i][0] = memo[i - 1][1] % 1000000000;
            memo[i][1] = (memo[i - 1][0] + memo[i - 1][2]) % 1000000000;
            memo[i][2] = (memo[i - 1][1] + memo[i - 1][3]) % 1000000000;
            memo[i][3] = (memo[i - 1][2] + memo[i - 1][4]) % 1000000000;
            memo[i][4] = (memo[i - 1][3] + memo[i - 1][5]) % 1000000000;
            memo[i][5] = (memo[i - 1][4] + memo[i - 1][6]) % 1000000000;
            memo[i][6] = (memo[i - 1][5] + memo[i - 1][7]) % 1000000000;
            memo[i][7] = (memo[i - 1][6] + memo[i - 1][8]) % 1000000000;
            memo[i][8] = (memo[i - 1][7] + memo[i - 1][9]) % 1000000000;
            memo[i][9] = (memo[i - 1][8]) % 1000000000;
        }
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum = (sum + memo[N - 1][i]) % 1000000000;
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
