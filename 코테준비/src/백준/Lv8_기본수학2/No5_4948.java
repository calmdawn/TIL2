package 백준.Lv8_기본수학2;

import java.io.*;

public class No5_4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] isPrime = new boolean[246913];

        isPrime[1] = true;

        for (int i = 2; i < 246913; i++) {
            if (isPrime[i] == false) {
                for (int j = 2; i * j < 246913; j++) {
                    isPrime[i * j] = true;
                }
            }
        }

        while (true) {
            int n = Integer.parseInt(br.readLine());
            int n2 = 2 * n;
            if (n == 0)
                break;
            int count = 0;

            if (n2 > 246912)
                n2 = 246912;

            for (int i = n + 1; i <= n2; i++) {
                if (!isPrime[i])
                    count++;
            }
            bw.write(count + "\n");
        }

        bw.flush();
        bw.close();
    }
}
