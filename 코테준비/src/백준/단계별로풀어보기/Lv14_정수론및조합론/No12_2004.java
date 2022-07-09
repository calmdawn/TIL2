package 백준.단계별로풀어보기.Lv14_정수론및조합론;

import java.io.*;
import java.util.StringTokenizer;

public class No12_2004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        long nTwo = 0;
        long nFive = 0;

        nTwo = getTwoCnt(n) - getTwoCnt(m) - getTwoCnt(n - m);
        nFive = getFiveCnt(n) - getFiveCnt(m) - getFiveCnt(n - m);

        bw.write(String.valueOf(Math.min(nTwo, nFive)));
        bw.flush();
        bw.close();
    }

    private static long getTwoCnt(long num) {
        long cnt = 0;
        while (num >= 2) {
            cnt = cnt + (num / 2);
            num = num / 2;
        }
        return cnt;
    }

    private static long getFiveCnt(long num) {
        long cnt = 0;
        while (num >= 5) {
            cnt = cnt + (num / 5);
            num = num / 5;
        }
        return cnt;
    }
}