package 백준.단계별로풀어보기.Lv3_반복문;

import java.io.*;
import java.util.StringTokenizer;

public class No8_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write("Case #" + i + ": " + a + " + " + b + " = " + (a + b));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
