package 백준.배열1차원;

import java.io.*;

public class No3_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int mulNUm = A * B * C;
        int[] numCnt = new int[10];

        while (mulNUm > 0) {
            numCnt[mulNUm % 10]++;
            mulNUm = mulNUm / 10;
        }

        for (int num : numCnt)
            bw.write(num + "\n");

        bw.flush();
        bw.close();
    }
}
