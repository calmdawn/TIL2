package 백준.Lv18_그리디알고리즘;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class No2_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] times = new int[N][2];
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            times[i][0] = Integer.parseInt(st.nextToken()); //시작시간
            times[i][1] = Integer.parseInt(st.nextToken()); //끝나는시간
        }
        Arrays.sort(times, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1])
                    return o1[0] - o2[0];
                return o1[1] - o2[1];
            }
        });

        int startIdx = 0;
        int maxCnt = 1;

        for (int i = 1; i < N; i++) {
            if (times[startIdx][1] <= times[i][0]) {
                startIdx = i;
                maxCnt++;
            }
        }

        bw.write(String.valueOf(maxCnt));
        bw.flush();
        bw.close();
    }
}
