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

        int M = Integer.parseInt(br.readLine());
        int[][] mNums = new int[M][3];  //원래값, 순서, 존재유무
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            mNums[i][0] = Integer.parseInt(st.nextToken());  //값
            mNums[i][1] = i;  //처음위치의 순서
        }

        Arrays.sort(nNums);
        Arrays.sort(mNums, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] < o2[0])
                    return -1;
                else if (o1[0] == o2[0])
                    return 0;
                else
                    return 1;
            }
        });

        int nIdx = 0;
        int mIdx = 0;
        while (nIdx < N && mIdx < M) {
            if (mNums[mIdx][0] == nNums[nIdx]) {
                mNums[mIdx][2] = 1;
                mIdx++;
            } else if (mNums[mIdx][0] < nNums[nIdx]) {
                mNums[mIdx][2] = 0;
                mIdx++;
            } else if (mNums[mIdx][0] > nNums[nIdx]) {
                nIdx++;
            }
        }

        Arrays.sort(mNums, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] < o2[1])
                    return -1;
                else if (o1[1] == o2[1])
                    return 0;
                else
                    return 1;
            }
        });

        for (int i = 0; i < M; i++)
            bw.write(mNums[i][2] + " ");
        bw.flush();
        bw.close();
    }
}
