package 백준.단계별로풀어보기.Lv3_반복문;

import java.io.*;

public class No6_2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = N; i > 0; i--)
            bw.write(String.valueOf(i) + "\n");
        bw.flush();
        bw.close();
    }
}
