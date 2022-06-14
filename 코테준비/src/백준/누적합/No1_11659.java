package 백준.누적합;

import java.io.*;
import java.util.StringTokenizer;

public class No1_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] numberSum = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            numberSum[i] = Integer.parseInt(st.nextToken());
            numberSum[i] = numberSum[i - 1] + numberSum[i];
        }

        for (int testCase = 0; testCase < M; testCase++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            bw.write(numberSum[j] - numberSum[i-1] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
