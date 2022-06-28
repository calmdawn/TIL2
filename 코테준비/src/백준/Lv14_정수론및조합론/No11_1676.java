package 백준.Lv14_정수론및조합론;

import java.io.*;
import java.util.HashMap;

public class No11_1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int ten = 0, two = 0, five = 0;
        int result = 0;

        for (int i = 1; i <= N; i++) {
            int temp = i;

            while (temp % 10 == 0) {
                ten++;
                temp = temp / 10;
            }
            while (temp % 2 == 0) {
                two++;
                temp = temp / 2;
            }
            while (temp % 5 == 0) {
                five++;
                temp = temp / 5;
            }

        }
        result = ten + Math.min(two, five);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}