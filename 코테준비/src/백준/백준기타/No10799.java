package 백준.백준기타;

import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class No10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int sum = 0;
        int barCnt = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                barCnt++;
            } else {
                if (input.charAt(i - 1) == ')') {
                    barCnt--;
                    sum = sum + 1;
                } else {
                    barCnt--;
                    sum = sum + barCnt;
                }
            }
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}