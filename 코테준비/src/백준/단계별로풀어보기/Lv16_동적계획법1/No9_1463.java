package 백준.단계별로풀어보기.Lv16_동적계획법1;

import java.io.*;

public class No9_1463 {
    private static int[] num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());
        num = new int[1000001];
        num[0] = 0;
        num[1] = 0;

        for (int i = 2; i <= X; i++) {
            num[i] = num[i - 1] + 1;
            if (i % 3 == 0)
                num[i] = Math.min(num[i / 3] + 1, num[i]);
            if (i % 2 == 0)
                num[i] = Math.min(num[i / 2] + 1, num[i]);
        }

        bw.write(String.valueOf(num[X]));
        bw.flush();
        bw.close();
    }
}
