package 백준.동적계획법1;

import java.io.*;

public class No1_24416 {
    private static int callFib = 0;
    private static int callFibonacci = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        fib(n);
        fibonacci(n);

        bw.write(callFib + " " + callFibonacci);
        bw.flush();
        bw.close();
    }

    private static int fibonacci(int n) {
        int[] dp = new int[n + 1];
        dp[1] = dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            callFibonacci++;
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    private static int fib(int n) {
        if (n == 1 || n == 2) {
            callFib++;
            return 1;
        } else
            return fib(n - 1) + fib(n - 2);
    }
}
