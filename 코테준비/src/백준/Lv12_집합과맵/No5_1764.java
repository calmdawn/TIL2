package 백준.Lv12_집합과맵;

import java.io.*;
import java.util.*;

public class No5_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Boolean> listenHashMap = new HashMap<>();
        ArrayList<String> bothPersonList = new ArrayList<>();

        for (int i = 0; i < N; i++)
            listenHashMap.put(br.readLine(), false);

        for (int i = 0; i < M; i++) {
            String person = br.readLine();
            if (listenHashMap.containsKey(person))
                bothPersonList.add(person);
        }
        Collections.sort(bothPersonList);

        bw.write(bothPersonList.size() + "\n");

        for (String person : bothPersonList)
            bw.write(person + "\n");
        bw.flush();
        bw.close();
    }
}
