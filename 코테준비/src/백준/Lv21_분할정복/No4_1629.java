package 백준.Lv21_분할정복;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class No4_1629 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        bw.write(String.valueOf(getNum(A, B, C)));
        bw.flush();
        bw.close();
    }

    private static long getNum(long a, long b, long c) {

        if (b == 1)
            return a % c;
        long temp = getNum(a, b / 2, c);

        if (b % 2 == 1)
            return (temp % c * temp % c * a % c) % c;

        return (temp % c * temp % c) % c;
    }
}
