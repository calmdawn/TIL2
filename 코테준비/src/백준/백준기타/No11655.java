package 백준.백준기타;

import java.io.*;

public class No11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        for (int i = 0; i < input.length(); i++) {  //  N기준
            char ch = input.charAt(i);
            if ('A' <= ch && ch <= 'M') {
                ch = (char) (ch + 13);
            } else if ('N' <= ch && ch <= 'Z') {
                ch = (char) (ch - 13);
            } else if ('a' <= ch && ch <= 'm') {
                ch = (char) (ch + 13);
            } else if ('n' <= ch && ch <= 'z') {
                ch = (char) (ch - 13);
            }
            bw.write(ch);
        }
        bw.flush();
        bw.close();
    }
}
