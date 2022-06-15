package 백준.Lv10_브루트포스;

import java.io.*;
import java.util.StringTokenizer;

public class No1_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] numbers = br.readLine().split(" ");
        int result = 0;
        int sum;

        for (int first = 0; first < numbers.length; first++) {
            for (int second = first + 1; second < numbers.length; second++) {
                for (int third = second + 1; third < numbers.length; third++) {
                    sum = Integer.parseInt(numbers[first]) + Integer.parseInt(numbers[second]) + Integer.parseInt(numbers[third]);
                    if (sum <= M && result < sum)
                        result = sum;
                }
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
