package 백준.Lv6_문자열;

import java.io.*;

public class No9_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();

        bw.write(String.valueOf(checkAlpha(word)));
        bw.flush();
        bw.close();
    }

    public static int checkAlpha(String word) {
        int idx = 0;
        int count = 0;
        while (idx < word.length()) {
            if (word.indexOf("c=", idx) == idx) { //현재위치인 idx 위치부터 탐색시작 위치가 같은경우 해당 단어찾음
                count++;
                idx = idx + 2;
            } else if (word.indexOf("c-", idx) == idx) {
                count++;
                idx = idx + 2;
            } else if (word.indexOf("dz=", idx) == idx) {
                count++;
                idx = idx + 3;
            } else if (word.indexOf("d-", idx) == idx) {
                count++;
                idx = idx + 2;
            } else if (word.indexOf("lj", idx) == idx) {
                count++;
                idx = idx + 2;
            } else if (word.indexOf("nj", idx) == idx) {
                count++;
                idx = idx + 2;
            } else if (word.indexOf("s=", idx) == idx) {
                count++;
                idx = idx + 2;
            } else if (word.indexOf("z=", idx) == idx) {
                count++;
                idx = idx + 2;
            } else {
                count++;
                idx++;
            }
        }
        return count;
    }
}
