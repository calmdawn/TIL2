package 백준.단계별로풀어보기.Lv14_정수론및조합론;

import java.io.*;

public class No7_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] numbers = br.readLine().split(" ");

        int N = Integer.parseInt(numbers[0]);
        int K = Integer.parseInt(numbers[1]);
        int up = 1, down = 1;

        for (int i = 0; i < K; i++) {
            up = up * (N - i);
            down = down * (K - i);
        }

        bw.write(String.valueOf(up / down));
        bw.flush();
        bw.close();
    }
}