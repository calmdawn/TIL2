package 백준.Lv18_그리디알고리즘;

import java.io.*;
import java.util.StringTokenizer;

public class No5_13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] roadLen = new int[N - 1];
        int[] cityCost = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < roadLen.length; i++) {
            roadLen[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        cityCost[0] = Integer.parseInt(st.nextToken());

        int cityIdx = 0;
        int min = 0;
        for (int i = 1; i < cityCost.length; i++) {
            cityCost[i] = Integer.parseInt(st.nextToken());
            min = min + cityCost[cityIdx] * roadLen[i - 1];

            if (cityCost[cityIdx] > cityCost[i])     //이전 도시보다 현재 도시의 주유값이 작은경우
                cityIdx = i;
        }

        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
    }
}
