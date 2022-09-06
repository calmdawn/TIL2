package 백준.단계별로풀어보기.Lv23_우선순위큐;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class No3_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PriorityQueue<Data> heap = new PriorityQueue<>(new Comparator<Data>() {
            @Override
            public int compare(Data o1, Data o2) {
                if(o1.num)
                return 0;
            }
        });
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) { // 절댓값 가장 작은 값 출력

            } else {    // 값 저장

            }
        }
        bw.flush();
        bw.close();
    }

    private static class Data {
        int num;
        boolean type;

        public Data(int num, boolean type) {
            this.num = num;
            this.type = type;
        }
    }

}
