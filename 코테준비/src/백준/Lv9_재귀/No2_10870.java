package 백준.Lv9_재귀;

import java.io.*;

public class No2_10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(fibonacci(n)));

        bw.flush();
        bw.close();
    }

    private static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 2) + fibonacci(n - 1);
    }
}
