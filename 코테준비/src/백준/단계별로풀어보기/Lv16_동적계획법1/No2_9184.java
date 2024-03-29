package 백준.단계별로풀어보기.Lv16_동적계획법1;

import java.io.*;
import java.util.StringTokenizer;

public class No2_9184 {
    private static int[][][] dp = new int[21][21][21];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == -1 && b == -1 && c == -1)
                break;
            sb.append("w(").append(a).append(", ")
                    .append(b).append(", ")
                    .append(c).append(") = ").append(w(a, b, c)).append("\n");
            bw.write(sb.toString());
            sb.setLength(0);
        }


        bw.flush();
        bw.close();
    }

    private static int w(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0)
            return 1;
        else if (a > 20 || b > 20 || c > 20)
            return dp[20][20][20] = w(20, 20, 20);
        else if (a < b && b < c) {
            if (dp[a][b][c] != 0)
                return dp[a][b][c];
            return dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
        } else {
            if (dp[a][b][c] != 0)
                return dp[a][b][c];
            return dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
        }
    }
}
