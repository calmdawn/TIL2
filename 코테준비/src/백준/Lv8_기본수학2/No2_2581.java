package 백준.Lv8_기본수학2;

import java.io.*;

public class No2_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int min = 0, sum = 0;

        for (int i = M; i <= N; i++) {
            if (checkPrime(i)) {
                if (min == 0)
                    min = i;
                sum = sum + i;
            }
        }

        if (sum == 0)
            bw.write("-1");
        else
            bw.write(sum + "\n" + min);
        bw.flush();
        bw.close();
    }

    private static boolean checkPrime(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
