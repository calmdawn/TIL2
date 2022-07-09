package 백준.단계별로풀어보기.Lv11_정렬;

import java.io.*;
import java.util.Arrays;

public class No2_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] numbers = new int[N];

        for (int i = 0; i < N; i++)
            numbers[i] = Integer.parseInt(br.readLine());

        Arrays.sort(numbers);

        for (int num : numbers)
            bw.write(num + "\n");
        bw.flush();
        bw.close();
    }
}
