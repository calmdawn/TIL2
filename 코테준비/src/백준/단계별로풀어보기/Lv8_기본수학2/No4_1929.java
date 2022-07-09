package 백준.단계별로풀어보기.Lv8_기본수학2;

import java.io.*;

public class No4_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] numbers = br.readLine().split(" ");
        int M = Integer.parseInt(numbers[0]);
        int N = Integer.parseInt(numbers[1]);

        if (M == 1 && M <= N)
            M++;
        if (M == 2 && M <= N) {
            bw.write("2" + "\n");
            M++;
        }
        while (M <= N) {
            if (M % 2 != 0) {
                boolean isPrime = true;
                for (int i = 3; i <= Math.sqrt(M); i = i + 2) {
                    if (M % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime)
                    bw.write(M + "\n");
            }
            M++;
        }

        bw.flush();
        bw.close();
    }
}
