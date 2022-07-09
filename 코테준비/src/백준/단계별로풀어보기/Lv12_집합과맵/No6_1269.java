package 백준.단계별로풀어보기.Lv12_집합과맵;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class No6_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int aCnt = Integer.parseInt(st.nextToken());
        int bCnt = Integer.parseInt(st.nextToken());

        HashMap<Integer, Boolean> elementMap = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < aCnt; i++)
            elementMap.put(Integer.valueOf(st.nextToken()), true);

        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < bCnt; j++) {
            int num = Integer.parseInt(st.nextToken());
            if (elementMap.containsKey(num))
                elementMap.remove(num);
            else
                elementMap.put(num, true);
        }

        bw.write(String.valueOf(elementMap.size()));
        bw.flush();
        bw.close();
    }
}
