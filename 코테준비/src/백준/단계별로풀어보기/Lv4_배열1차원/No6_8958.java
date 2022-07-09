package 백준.단계별로풀어보기.Lv4_배열1차원;

import java.io.*;

public class No6_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            String str = br.readLine();
            int score = 0;
            int oCnt = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    oCnt++;
                    score = score + oCnt;
                } else
                    oCnt = 0;
            }
            bw.write(score + "\n");
        }

        bw.flush();
        bw.close();
    }
}
