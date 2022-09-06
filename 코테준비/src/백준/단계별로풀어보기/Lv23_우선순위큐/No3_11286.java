package 백준.단계별로풀어보기.Lv23_우선순위큐;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class No3_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int absNum1 = Math.abs(o1);
                int absNum2 = Math.abs(o2);
                if (absNum1 == absNum2) {
                    if (o1 < o2)
                        return -1;
                    else if (o1 == o2)
                        return 0;
                    else
                        return 1;
                } else if (absNum1 < absNum2) {
                    return -1;
                } else
                    return 1;
            }
        });
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) { // 절댓값 가장 작은 값 출력
                if (heap.isEmpty())
                    bw.write("0\n");
                else
                    bw.write(heap.poll() + "\n");
            } else {    // 값 저장
                heap.offer(num);
            }
        }
        bw.flush();
        bw.close();
    }
}
