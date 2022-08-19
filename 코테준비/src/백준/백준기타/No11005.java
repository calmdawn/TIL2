package 백준.백준기타;

import java.io.*;
import java.util.StringTokenizer;

public class No11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        String result = getResult(N, B);
        bw.write(result);
        bw.flush();
        bw.close();
    }

    private static String getResult(int N, int B) {
        StringBuffer sb = new StringBuffer();
        String base = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        while (N != 0) {
            sb.append(base.charAt(N % B));
            N = N / B;
        }
        return sb.reverse().toString();
    }
}
