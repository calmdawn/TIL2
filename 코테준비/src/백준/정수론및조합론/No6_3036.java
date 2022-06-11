package 백준.정수론및조합론;

import java.io.*;
import java.util.StringTokenizer;

public class No6_3036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] rings = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            rings[i] = Integer.parseInt(st.nextToken());

        for (int i = 1; i < N; i++) {
            int gcd = getGcd(rings[0], rings[i]);
            bw.write(rings[0] / gcd + "/" + rings[i] / gcd + "\n");
        }

        bw.flush();
        bw.close();
    }

    private static int getGcd(int num1, int num2) {
        if (num1 % num2 == 0)
            return num2;
        else
            return getGcd(num2, num1 % num2);
    }
}