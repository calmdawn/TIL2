package 백준.Lv22_이분탐색;

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
            int locate = getBinarySearch(nNumbers, mNumbers[i]);
            if (locate == -1)
                bw.write("0 ");
            else
                bw.write(searchCount(locate, nNumbers, mNumbers[i]) + " ");
        }

        bw.flush();
        bw.close();
    }

    private static int searchCount(int locate, int[] nNumbers, int val) {
        int cnt = 1;
        int left = locate - 1;
        int right = locate + 1;

        //현위치에서 왼쪽 탐색
        while (0 <= left && nNumbers[left] == val) {
            cnt++;
            left--;
        }

        //현위치에서 오른쪽 탐색
        while (right < nNumbers.length && nNumbers[right] == val) {
            cnt++;
            right++;
        }
        return cnt;
    }

    private static int getBinarySearch(int[] nNumbers, int key) {
        int left = 0;
        int right = nNumbers.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nNumbers[mid] < key) {
                left = mid + 1;
            } else if (key < nNumbers[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
