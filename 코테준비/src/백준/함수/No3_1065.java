package 백준.함수;

import java.io.*;

public class No3_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        if (N >= 100) {
            count = 99;
            for (int i = 100; i <= N; i++) {
                if (checkOne(String.valueOf(i)))
                    count++;
            }
            bw.write(String.valueOf(count));
        } else
            bw.write(String.valueOf(N));
        bw.flush();
        bw.close();
    }

    public static boolean checkOne(String str) {

        int prev = str.charAt(0) - str.charAt(1);
        int next = 0;

        for (int i = 1; i < str.length() - 1; i++) {
            next = str.charAt(i) - str.charAt(i + 1);
            if (prev != next)
                return false;
            prev = next;
        }
        return true;
    }
}
