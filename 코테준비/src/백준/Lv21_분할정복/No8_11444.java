package 백준.Lv21_분할정복;

import java.io.*;
import java.util.StringTokenizer;

public class No8_11444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        long n0 = 0;
        long n1 = 1;
        long n2 = 0;

        for (long i = 2; i <= n; i++) {
            n2 = (n1 + n0) % 1000000007;
            n0 = n1 % 1000000007;
            n1 = n2 % 1000000007;
        }

        bw.write(String.valueOf(n2));
        bw.close();
    }
}
