package 백준.단계별로풀어보기.Lv17_누적합;

import java.io.*;
import java.util.StringTokenizer;

public class No2_2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] tempers = new int[N + 1];

        int sIdx = 1;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            tempers[i] = Integer.parseInt(st.nextToken());
        }

        for (; sIdx <= K - 1; sIdx++) {
            sum = sum + tempers[sIdx];
        }

        for (int i = sIdx; i <= N; i++) {
            sum = sum - tempers[i - K] + tempers[i];
            max = Math.max(max, sum);
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }
}
