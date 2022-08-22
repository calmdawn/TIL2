package 백준.백준기타;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class No2331 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] inputs = br.readLine().split(" ");
        long A = Long.parseLong(inputs[0]);
        long P = Long.parseLong(inputs[1]);
        Map<Long, Boolean> map = new HashMap<>();
        map.put(A, true);
        long D = A;
        while (true) {//반복 수열이 나올때까지 값 넣기
            D = getD(D, P);
            if (map.get(D) != null) {
                map.remove(D);
                break;
            }
            map.put(D, true);
        }

        while (true) {//반복 수열이 안나올때까지 값 빼기
            D = getD(D, P);
            if (map.get(D) == null)
                break;
            map.remove(D);
        }
        bw.write(String.valueOf(map.size()));
        bw.flush();
        bw.close();
    }

    private static long getD(long D, long P) {
        long sum = 0;
        while (D > 0) {
            long tmp = D % 10;
            sum = sum + (long) Math.pow(tmp, P);
            D = D / 10;
        }
        return sum;
    }
}
