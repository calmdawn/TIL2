package 백준.정수론및조합론;

import java.io.*;
import java.math.BigInteger;

public class No8_11051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] numbers = br.readLine().split(" ");

        int N = Integer.parseInt(numbers[0]);
        int K = Integer.parseInt(numbers[1]);
        BigInteger up = new BigInteger("1");
        BigInteger down = new BigInteger("1");

        for (int i = 0; i < K; i++) {
            up = up.multiply(new BigInteger(String.valueOf(N - i)));
            down = down.multiply(new BigInteger(String.valueOf(K - i)));
        }

        bw.write(up.divide(down).mod(new BigInteger("10007")).toString());
        bw.flush();
        bw.close();
    }
}