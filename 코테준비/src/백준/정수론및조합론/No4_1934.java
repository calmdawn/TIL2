package 백준.정수론및조합론;

import java.io.*;
import java.util.StringTokenizer;

public class No4_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int testCase = 0; testCase < T; testCase++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int gcd = getGcd(a, b);
            bw.write(a * (b / gcd) + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int getGcd(int a, int b) {
        if (a % b == 0)
            return b;
        else
            return getGcd(b, a % b);
    }
}