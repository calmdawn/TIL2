package 백준.Lv18_그리디알고리즘;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class No3_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] times = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sumTime;

        for (int i = 0; i < N; i++)
            times[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(times);

        sumTime = times[0];
        for (int i = 1; i < N; i++) {
            times[i] = times[i] + times[i - 1];
            sumTime = sumTime + times[i];
        }

        bw.write(String.valueOf(sumTime));
        bw.flush();
        bw.close();
    }
}
