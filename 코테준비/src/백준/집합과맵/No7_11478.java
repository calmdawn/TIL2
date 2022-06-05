package 백준.집합과맵;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class No7_11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        HashMap<String, Boolean> partHashMap = new HashMap<>();

        int len = 1;
        while (len <= S.length()) {

            for (int i = 0; i <= S.length() - len; i++) {
                partHashMap.put(S.substring(i, i + len), true);
            }
            len++;
        }

        bw.write(String.valueOf(partHashMap.size()));
        bw.flush();
        bw.close();
    }
}
