package 백준.백준기타;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class No1168 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken()) - 1;
        for (int i = 1; i <= N; i++) //초기 N명의 사람 추가
            list.add(i);
        int idx = 0;

        bw.write("<");
        while (list.size() != 1) {
            idx = idx + K;
            if (idx >= list.size())
                idx = idx % list.size();
            bw.write(list.remove(idx) + ", ");
        }
        bw.write(list.get(0) + ">");
        bw.flush();
        bw.close();
    }
}