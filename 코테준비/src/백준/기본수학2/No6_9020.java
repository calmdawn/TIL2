package 백준.기본수학2;

import java.io.*;

public class No6_9020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        boolean[] isPrime = new boolean[10001];

        for (int i = 2; i < 10001; i++) {
            if (isPrime[i] == false) {
                for (int j = 2; i * j < 10001; j++)
                    isPrime[i * j] = true;
            }
        }

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int prev = n / 2;
            int next = n / 2;

            while (true) {
                if (isPrime[prev] == false && isPrime[next] == false)
                    break;
                prev--;
                next++;
            }
            bw.write(prev + " " + next + "\n");
        }

        bw.flush();
        bw.close();
    }
}
