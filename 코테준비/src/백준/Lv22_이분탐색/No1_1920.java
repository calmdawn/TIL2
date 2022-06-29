package 백준.Lv22_이분탐색;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class No1_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] nNums = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            nNums[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(nNums);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++)
            bw.write(getBinarySearch(nNums, Integer.parseInt(st.nextToken())) + " ");

        bw.flush();
        bw.close();
    }

    private static String getBinarySearch(int[] nNums, int key) {
        int left = 0;
        int right = nNums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (key < nNums[mid]) {
                right = mid-1;
            } else if (key > nNums[mid]) {
                left = mid+1;
            } else {
                return "1";
            }
        }
        return "0";
    }
}
