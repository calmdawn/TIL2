package 백준.백준기타;

import java.io.*;
import java.util.StringTokenizer;

public class No10824 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long sumAB = Long.parseLong(st.nextToken() + st.nextToken());
        long sumCD = Long.parseLong(st.nextToken() + st.nextToken());
        bw.write(String.valueOf(sumAB+sumCD));
        bw.flush();
        bw.close();
    }
}
