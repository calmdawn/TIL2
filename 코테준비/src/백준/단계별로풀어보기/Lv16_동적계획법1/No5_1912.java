package 백준.단계별로풀어보기.Lv16_동적계획법1;

import java.io.*;
import java.util.StringTokenizer;

public class No5_1912 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] memo = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        memo[0] = Integer.parseInt(st.nextToken());

        int max = -1001;

        for (int i = 1; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num > 0) {
                if (memo[i - 1] > 0)
                    memo[i] = memo[i - 1] + num;
                else
                    memo[i] = num;
            } else {
                if (memo[i - 1] + num > 0)
                    memo[i] = memo[i - 1] + num;
                else
                    memo[i] = num;
            }
        }

        for (int num : memo)
            max = Math.max(max, num);

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }
}
