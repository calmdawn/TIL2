package 백준.알고리즘기초1_1;

import java.io.*;

public class No2_9093 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringBuilder sb = new StringBuilder(br.readLine());
            sb.reverse();

            String[] words = sb.toString().split(" ");
            StringBuilder text = new StringBuilder();

            for (int k = words.length - 1; k >= 0; k--) {
                text.append(words[k] + " ");
            }

            bw.write(text.toString().trim());
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
