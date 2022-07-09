package 백준.단계별로풀어보기.Lv7_기본수학1;

import java.io.*;
import java.math.BigInteger;

public class No8_10757 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] numbers = br.readLine().split(" ");
        BigInteger bigA = new BigInteger(numbers[0]);
        BigInteger bigB = new BigInteger(numbers[1]);

        bw.write(bigA.add(bigB).toString());
        bw.flush();
        bw.close();
    }
}
