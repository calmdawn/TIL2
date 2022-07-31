package 백준.단계별로풀어보기.Lv16_동적계획법1;

import java.io.*;
import java.util.StringTokenizer;

public class No16_12865 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());    //물품의 수
        int K = Integer.parseInt(st.nextToken());    //버틸 수 있는 최대무게
        int[][] infos = new int[N + 1][2];
        int[][] dp = new int[N + 1][K + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            infos[i][0] = Integer.parseInt(st.nextToken()); //물건 무게
            infos[i][1] = Integer.parseInt(st.nextToken()); //물건 가치
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                if (infos[i][0] <= j) {    //현재들어갈 수 있는 무게보다 작거나 같은 경우
                    dp[i][j] = Math.max(infos[i][1] + dp[i - 1][j - infos[i][0]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        bw.write(String.valueOf(dp[N][K]));
        bw.flush();
        bw.close();
    }

}
