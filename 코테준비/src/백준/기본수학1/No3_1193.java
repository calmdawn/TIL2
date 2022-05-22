package 백준.기본수학1;

import java.io.*;

public class No3_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());

        int num = 0;
        int lineCnt = 0;
        int temp = 0;
        int up, down;
        while (num < X) {
            lineCnt++;
            for (int i = lineCnt; i > 0; i--)
                num++;
        }

        temp = lineCnt * (lineCnt - 1) / 2;
        up = lineCnt - (X - temp) + 1;
        down = X - temp;

        if (lineCnt % 2 == 1)
            bw.write(up + "/" + down);
        else
            bw.write(down + "/" + up);
        bw.flush();
        bw.close();
    }
}
