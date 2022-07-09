package 백준.단계별로풀어보기.Lv17_누적합;

import java.io.*;
import java.util.StringTokenizer;

public class No4_10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] numbers = new int[N + 1];
        int cnt = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken()) + numbers[i - 1];
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j <= N; j++) {
                if ((numbers[j] - numbers[i]) % M == 0)
                    cnt++;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}
