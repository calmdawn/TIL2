package 백준.분할정복;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class No4_1629 {

    static BigInteger A;
    static BigInteger C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        A = new BigInteger(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        C = new BigInteger(st.nextToken());

        bw.write(getNum(B).mod(C).toString());
        bw.flush();
        bw.close();
    }

    private static BigInteger getNum(int B) {
        if (B == 0)
            return BigInteger.ONE;
        else
            return A.multiply(getNum(B - 1));
    }
}
