package 백준.단계별로풀어보기.Lv16_동적계획법1;

import java.io.*;

public class No3_1904 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] memo = new int[N + 1];

        if (N == 1)
            bw.write("1");
        else if (N == 2)
            bw.write("2");
        else {
            memo[1] = 1;
            memo[2] = 2;
            for (int i = 3; i <= N; i++)
                memo[i] = (memo[i - 2] + memo[i - 1]) % 15746;
            bw.write(String.valueOf(memo[N]));
        }

        bw.flush();
        bw.close();
    }
}
