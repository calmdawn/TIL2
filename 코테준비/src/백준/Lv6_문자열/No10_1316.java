package 백준.Lv6_문자열;

import java.io.*;

public class No10_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (checkGroupWord(br.readLine()))
                count++;
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }

    private static boolean checkGroupWord(String word) {
        boolean[] alpha = new boolean[26];

        char prev = word.charAt(0);
        char next = 'a';

        for (int i = 1; i < word.length(); i++) {
            next = word.charAt(i);
            if (alpha[prev - 'a'] == true)
                return false;
            if (prev == next)
                prev = next;
            else {
                alpha[prev - 'a'] = true;
                prev = next;
            }
        }
        if (alpha[next - 'a'] == true)
            return false;

        return true;
    }
}
