package 백준.정렬;

import java.io.*;

public class No1_2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] numbers = new int[N];

        for (int i = 0; i < N; i++)
            numbers[i] = Integer.parseInt(br.readLine());

        for (int j = 0; j < N; j++) {
            for (int k = j + 1; k < N; k++) {
                if (numbers[j] > numbers[k]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[k];
                    numbers[k] = temp;
                }
            }
        }

        for (int num : numbers)
            bw.write(num + "\n");
        bw.flush();
        bw.close();
    }
}
