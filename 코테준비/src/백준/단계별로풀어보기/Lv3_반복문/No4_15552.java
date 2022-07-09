package 백준.단계별로풀어보기.Lv3_반복문;

import java.io.*;

public class No4_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String line = br.readLine();
            int locate = line.indexOf(" ");
            int a = Integer.parseInt(line.substring(0, locate));
            int b = Integer.parseInt(line.substring(locate + 1));
            bw.write(String.valueOf(a + b));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
