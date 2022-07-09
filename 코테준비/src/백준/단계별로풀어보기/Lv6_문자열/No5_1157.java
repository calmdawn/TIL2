package 백준.단계별로풀어보기.Lv6_문자열;

import java.io.*;

public class No5_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        int[] alpha = new int[26];
        char mostCh = '?';
        int max = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if ('a' <= ch && ch <= 'z')
                alpha[ch - 'a']++;
            else
                alpha[ch - 'A']++;
        }

        for (int j = 0; j < alpha.length; j++) {
            if (alpha[j] > max) {
                max = alpha[j];
                mostCh = (char) (j + 'A');
            } else if (alpha[j] == max)
                mostCh = '?';
        }

        bw.write(mostCh);
        bw.flush();
        bw.close();
    }
}
