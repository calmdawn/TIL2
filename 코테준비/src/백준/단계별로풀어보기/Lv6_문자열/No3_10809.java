package 백준.단계별로풀어보기.Lv6_문자열;

import java.io.*;

public class No3_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] alphaLocate = new int[26];
        String S = br.readLine();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphaLocate[ch - 'a'] = S.indexOf(ch);
        }

        for (int locate : alphaLocate)
            bw.write(locate + " ");

        bw.flush();
        bw.close();
    }
}
