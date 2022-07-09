package 백준.단계별로풀어보기.Lv22_이분탐색;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No2_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] nNumbers = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            nNumbers[i] = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(br.readLine());
        int[] mNumbers = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++)
            mNumbers[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(nNumbers);

        for (int i = 0; i < M; i++) {
            bw.write(getUpperBinarySearch(nNumbers, mNumbers[i])
                    - getLowerBinarySearch(nNumbers, mNumbers[i]) + " ");
        }

        bw.flush();
        bw.close();
    }

    private static int getLowerBinarySearch(int[] nNumbers, int key) {
        int left = 0;
        int right = nNumbers.length;

        while (left < right) {
            int mid = (left + right) / 2;
            if (key <= nNumbers[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }


    private static int getUpperBinarySearch(int[] nNumbers, int key) {
        int left = 0;
        int right = nNumbers.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (key < nNumbers[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
