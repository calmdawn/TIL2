package 백준.기본수학2;

import java.io.*;

public class No3_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int sNum = 2;

        while (sNum <= N) {
            if (N % sNum == 0) {
                N = N / sNum;
                bw.write(sNum + "\n");
            } else {
                sNum++;
            }
        }
        bw.flush();
        bw.close();
    }
}
