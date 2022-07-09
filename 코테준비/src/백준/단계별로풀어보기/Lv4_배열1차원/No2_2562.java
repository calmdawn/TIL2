package 백준.단계별로풀어보기.Lv4_배열1차원;

import java.io.*;

public class No2_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;
        int locate = 0;
        for (int i = 1; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            if (max < num) {
                max = num;
                locate = i;
            }
        }
        bw.write(max + "\n" + locate);
        bw.flush();
        bw.close();
    }
}
