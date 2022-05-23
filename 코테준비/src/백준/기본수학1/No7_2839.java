package 백준.기본수학1;

import java.io.*;

public class No7_2839 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int five = 0;
        int three = 0;

        five = N / 5;

        while (five >= 0) {
            if ((N - (five * 5)) % 3 == 0) {
                three = (N - (five * 5)) / 3;
                break;
            }
            five--;
        }

        if (five == -1)
            bw.write("-1");
        else
            bw.write(String.valueOf(five + three));
        bw.flush();
        bw.close();
    }
}
