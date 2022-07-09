package 백준.단계별로풀어보기.Lv14_정수론및조합론;

import java.io.*;
import java.util.StringTokenizer;

public class No3_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int n = 1;
        int maxCommon = 1;
        int minCommon = 0;

        while (true) {
            if (num1 % n == 0 && num2 % n == 0) {
                maxCommon = maxCommon * n;
                num1 = num1 / n;
                num2 = num2 / n;
                n = 1;
            }
            if (num1 < n || num2 < n)
                break;
            n++;
        }
        minCommon = maxCommon * num1 * num2;

        bw.write(maxCommon + "\n" + minCommon);
        bw.flush();
        bw.close();
    }
}