package 백준.Lv16_동적계획법1;

import java.io.*;
import java.util.StringTokenizer;

public class No9_1463 {
    private static int[] num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        num = new int[100001];

        getCount(N, 1);

        bw.write(String.valueOf(num[1]));
        bw.flush();
        bw.close();
    }

    private static void getCount(int n, int cnt) {
        if (n == 1)
            return;

        if (n % 3 == 0) {
            if (num[n / 3] == 0)
                num[n / 3] = cnt;
            else
                num[n / 3] = Math.min(num[n / 3], cnt);
            getCount(n / 3, cnt + 1);
        }

        if (n % 2 == 0) {
            if (num[n / 2] == 0)
                num[n / 2] = cnt;
            else
                num[n / 2] = Math.min(num[n / 2], cnt);
            getCount(n / 2, cnt + 1);
        }

        if (num[n - 1] == 0)
            num[n - 1] = cnt;
        else
            num[n - 1] = Math.min(num[n - 1], cnt);
        getCount(n - 1, cnt + 1);
    }
}
