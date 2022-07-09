package 백준.단계별로풀어보기.Lv20_큐_덱;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No4_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Queue<Integer> queue = new LinkedList<>();

        for (int testCase = 0; testCase < T; testCase++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());   //문서의 개수
            int locateDoc = Integer.parseInt(st.nextToken());   // 궁금한 문서
            int[] priNumbers = new int[N];  // 중요도 숫자들
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < N; i++) {
                int num = Integer.parseInt(st.nextToken());
                priNumbers[i] = num;
                queue.add(num);
            }
            Arrays.sort(priNumbers);

            int priIdx = priNumbers.length - 1; //중요도 높은순위 위치
            int cnt = 0;
            while (!queue.isEmpty()) {
                if (queue.peek() == priNumbers[priIdx]) { //중요도가 제일 높은 문서인경우
                    queue.poll();
                    priIdx--;
                    cnt++;
                    if(locateDoc == 0)
                        break;
                    locateDoc--;
                } else {
                    queue.add(queue.poll());
                    if (locateDoc == 0)
                        locateDoc = queue.size() - 1;
                    else
                        locateDoc--;
                }
            }
            bw.write(cnt+"\n");
            queue.clear();
        }

        bw.flush();
        bw.close();
    }
}
