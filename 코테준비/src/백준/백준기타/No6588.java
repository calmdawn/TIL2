package 백준.백준기타;

import java.io.*;

public class No6588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] prime = new boolean[1000001];

        prime[0] = prime[1] = true;
        for (int i = 2; i < 1000001; i++) { //소수 세팅
            if (prime[i] == false) {
                for (int j = 2; i * j < 1000001; j++) {
                    prime[i * j] = true;
                }
            }
        }
        int n = 0;
        mainLoop:
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            for (int i = 3; i <= n / 2; i = i + 2) {
                if (prime[i] == false && prime[n - i] == false) {
                    bw.write(n + " = " + i + " + " + (n - i) + "\n");
                    continue mainLoop;
                }
            }
            bw.write("Goldbach's conjecture is wrong." + "\n");
        }
        bw.flush();
        bw.close();
    }
}
