package 백준.백준기타;

import java.io.*;
import java.util.*;

public class No11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        HashMap<Long, Integer> numMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(br.readLine());
            if (numMap.get(num) == null)
                numMap.put(num, 1);
            else
                numMap.put(num, numMap.get(num) + 1);
        }
        long[] max = new long[2]; //수, 개수
        for (long num : numMap.keySet()) {
            if(max[1] < numMap.get(num)){
                max[0] = num;
                max[1] = numMap.get(num);
            }else if(max[1] == numMap.get(num)) {
                max[0] = Math.min(max[0], num);
            }
        }
        bw.write(String.valueOf(max[0]));
        bw.flush();
        bw.close();
    }
}