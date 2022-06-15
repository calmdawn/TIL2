package 백준.Lv6_문자열;

import java.io.*;

public class No2_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        String number = br.readLine();

        for(int i=0; i<N; i++)
            sum = sum + Integer.parseInt(String.valueOf(number.charAt(i)));

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
