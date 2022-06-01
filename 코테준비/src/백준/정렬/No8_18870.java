package 백준.정렬;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class No8_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] originNumbers = new int[N];
        int[] sortNumbers = new int[N];
        int cnt = 0;

        HashMap<Integer, Integer> xHashMap = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++) {
            originNumbers[i] = Integer.parseInt(st.nextToken());
            sortNumbers[i] = originNumbers[i];
        }

        Arrays.sort(sortNumbers);

        for (int i = 0; i < N-1; i++) {
            if(sortNumbers[i] != sortNumbers[i+1]){
                xHashMap.put(sortNumbers[i], cnt);
                cnt++;
            }
        }
        xHashMap.put(sortNumbers[N-1],cnt);

        for (int i = 0; i < N; i++)
            bw.write(xHashMap.get(originNumbers[i])+ " ");

        bw.flush();
        bw.close();
    }
}
