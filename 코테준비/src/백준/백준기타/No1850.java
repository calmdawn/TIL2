package 백준.백준기타;

import java.io.*;
import java.util.StringTokenizer;

public class No1850 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long max = getGcd(A, B);
        StringBuffer sb = new StringBuffer();
        for (long i = 0; i < max; i++)
            sb.append("1");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static long getGcd(long a, long b) {
        if (a % b == 0)
            return b;
        return getGcd(b, a % b);
    }
}
