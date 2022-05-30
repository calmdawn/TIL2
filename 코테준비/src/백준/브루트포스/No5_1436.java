package 백준.브루트포스;

import java.io.*;
import java.util.StringTokenizer;

public class No5_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int startNum = 0;
        int count = 0;

        while (count != N) {
            int sixCnt = 0;

            for (int j = startNum; j > 0; j = j / 10) {

                if (j % 10 == 6)
                    sixCnt++;
                else
                    sixCnt = 0;

                if (sixCnt >= 3) {
                    count++;
                    break;
                }
            }

            if (count == N) {
                bw.write(String.valueOf(startNum));
                break;
            }

            startNum++;
        }

        bw.flush();
        bw.close();
    }


}
