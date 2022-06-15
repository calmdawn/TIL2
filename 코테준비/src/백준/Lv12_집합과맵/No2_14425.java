package 백준.Lv12_집합과맵;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class No2_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt = 0;
        HashMap<String, Boolean> strHashMap = new HashMap<String, Boolean>();

        for (int i = 0; i < N; i++)
            strHashMap.put(br.readLine(), false);

        for (int i = 0; i < M; i++) {
            if(strHashMap.containsKey(br.readLine()))
                cnt++;
        }
        bw.write(String.valueOf(cnt));

        bw.flush();
        bw.close();
    }
}
