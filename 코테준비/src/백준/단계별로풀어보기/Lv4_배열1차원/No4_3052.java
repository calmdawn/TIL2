package 백준.단계별로풀어보기.Lv4_배열1차원;

import java.io.*;

public class No4_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = new int[42];
        int count = 0;

        for (int i = 0; i < 10; i++)
            numbers[Integer.parseInt(br.readLine()) % 42]++;

        for (int num : numbers) {
            if (num > 0)
                count++;
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
