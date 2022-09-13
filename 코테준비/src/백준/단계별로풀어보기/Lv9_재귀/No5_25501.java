package 백준.단계별로풀어보기.Lv9_재귀;

import java.io.*;

public class No5_25501 {
    private static int recurCnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            recurCnt = 0;
            bw.write(isPalindrome(br.readLine()) + " " + recurCnt + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }

    private static int recursion(String s, int l, int r) {
        recurCnt++;
        if (l >= r)
            return 1;
        else if (s.charAt(l) != s.charAt(r))
            return 0;
        else
            return recursion(s, l + 1, r - 1);
    }
}
