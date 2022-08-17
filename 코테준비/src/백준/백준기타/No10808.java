package 백준.백준기타;

import java.io.*;
import java.util.HashMap;

public class No10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] alphabet = new int[26];
        String input = br.readLine();
        for (int i = 0; i < input.length(); i++)
            alphabet[input.charAt(i) - 'a']++;
        for (int cnt : alphabet)
            bw.write(cnt + " ");
        bw.flush();
        bw.close();
    }
}