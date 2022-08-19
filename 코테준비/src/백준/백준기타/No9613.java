package 백준.백준기타;

import java.io.*;
import java.util.StringTokenizer;

public class No9613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int testCase = 0; testCase < t; testCase++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++)
                numbers[i] = Integer.parseInt(st.nextToken());

            long sum = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    sum = sum + getGcd(numbers[i], numbers[j]);
                }
            }
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int getGcd(int a, int b) {
        if (b == 0)
            return a;
        return getGcd(b, a % b);
    }
}
