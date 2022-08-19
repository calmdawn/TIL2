package 백준.백준기타;

import java.io.*;
import java.util.StringTokenizer;

public class No11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int result = getResult(N, B);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    private static int getResult(String N, int B) {
        int num = 0;
        for (int i = 0; i < N.length(); i++) {
            char ch = N.charAt(i);
            if ('0' <= ch && ch <= '9') {
                num = num * B + (ch - '0');
            } else {
                num = num * B + (ch - 'A' + 10);
            }
        }
        return num;
    }
}
