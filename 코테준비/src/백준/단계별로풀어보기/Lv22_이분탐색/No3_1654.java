package 백준.단계별로풀어보기.Lv22_이분탐색;

import java.io.*;

public class No3_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] inputs = br.readLine().split(" ");
        int K = Integer.parseInt(inputs[0]);
        int N = Integer.parseInt(inputs[1]);
        int[] cables = new int[K];

        long end = 0;
        for (int i = 0; i < K; i++) {
            cables[i] = Integer.parseInt(br.readLine());
            end = Math.max(end, cables[i]);
        }
        long len = runUpperBound(K, N, cables, end + 1);

        bw.write(String.valueOf(len));
        bw.flush();
        bw.close();
    }

    private static long runUpperBound(int K, int N, int[] cables, long end) {
        long start = 0;
        while (start < end) {
            long mid = (start + end) / 2;    //랜선의 길이
            long cnt = 0;
            for (int i = 0; i < K; i++) {
                cnt = cnt + cables[i] / mid;
            }
            if (cnt >= N) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end - 1;
    }
}
