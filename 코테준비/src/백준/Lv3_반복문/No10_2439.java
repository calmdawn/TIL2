package 백준.Lv3_반복문;

import java.io.*;

public class No10_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            for (int j = 0; j < T - i; j++)
                bw.write(" ");
            for (int k = 0; k < i; k++)
                bw.write("*");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
