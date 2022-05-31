package 백준.정렬;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class No4_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] numbers = br.readLine().split("");

        Arrays.sort(numbers);

        for (int i = numbers.length - 1; i >= 0; i--)
            bw.write(numbers[i]);

        bw.flush();
        bw.close();
    }
}
