package 백준.단계별로풀어보기.Lv27_투포인터;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No1_3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++)
            numbers[i] = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(br.readLine());

        Arrays.sort(numbers);
        int sIdx = 0, eIdx = n - 1;
        int result = 0;
        while (sIdx < eIdx) {
            int sum = numbers[sIdx] + numbers[eIdx];
            if (sum == x) { //같은경우 중복값이 있을 수 있으므로 곱연산 해주어야함
                if (numbers[sIdx] == numbers[eIdx]) {
                    result = result + (eIdx - sIdx + 1) * 2;
                    break;
                }
                int sCnt = 1, eCnt = 1;
                sIdx++;
                eIdx--;
                while (numbers[sIdx] == numbers[sIdx - 1]) {   //이전 수와 같다면
                    sCnt++;
                    sIdx++;
                }
                while (numbers[eIdx] == numbers[eIdx + 1]) {   //이전 수와 같다면
                    eCnt++;
                    eIdx--;
                }
                result = result + sCnt * eCnt;
            } else if (sum < x) {
                sIdx++;
            } else {
                eIdx--;
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
