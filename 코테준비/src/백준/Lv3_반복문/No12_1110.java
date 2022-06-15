package 백준.Lv3_반복문;

import java.io.*;

public class No12_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int len = 0;
        int temp = N;
        int newNum = -1;

        while (N != newNum) {
            if (temp < 10)
                newNum = temp * 10 + temp;
            else
                newNum = (temp % 10 * 10) + ((temp / 10 + temp % 10) % 10);
            temp = newNum;
            len++;
        }
        bw.write(String.valueOf(len));
        bw.flush();
        bw.close();
    }
}
