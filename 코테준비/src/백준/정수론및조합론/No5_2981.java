package 백준.정수론및조합론;

import java.io.*;
import java.util.StringTokenizer;

public class No5_2981 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        for (int mod = 2; mod <= 1000000000; mod++) {
            int temp = numbers[0] % mod;
            for (int i = 1; i < N; i++) {
                if (numbers[i] % mod != temp) {
                    temp = -1;
                    break;
                }
            }
            if (temp != -1)
                bw.write(mod + " ");
        }
        bw.flush();
        bw.close();
    }
}