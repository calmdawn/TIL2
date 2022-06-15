package 백준.Lv15_백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No7_14888 {
    private static int N;
    private static int[] numbers;
    private static int[] operators;
    private static boolean[] isUsed;
    private static int min = Integer.MAX_VALUE;
    private static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        numbers = new int[N];
        operators = new int[N - 1];
        isUsed = new boolean[N - 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            numbers[i] = Integer.parseInt(st.nextToken());

        //연산자 개수별로 값 세팅
        int idx = 0;
        st = new StringTokenizer(br.readLine());
        int add = Integer.parseInt(st.nextToken());
        int sub = Integer.parseInt(st.nextToken());
        int mul = Integer.parseInt(st.nextToken());
        int div = Integer.parseInt(st.nextToken());
        while (add-- > 0)
            operators[idx++] = 1;
        while (sub-- > 0)
            operators[idx++] = 2;
        while (mul-- > 0)
            operators[idx++] = 3;
        while (div-- > 0)
            operators[idx++] = 4;

        int val = numbers[0];
        calculNum(1, val, 1);
        System.out.print(max + "\n" + min);
    }

    private static void calculNum(int cnt, int val, int nextIdx) {
        if (cnt == N) {
            min = Math.min(min, val);
            max = Math.max(max, val);
            return;
        }
        for (int i = 0; i < operators.length; i++) {
            if (isUsed[i] == false) {
                isUsed[i] = true;
                calculNum(cnt + 1, getOperNum(val, numbers[nextIdx], operators[i]), nextIdx + 1);
                isUsed[i] = false;
            }
        }
    }

    private static int getOperNum(int val, int nextVal, int operator) {
        if (operator == 1)
            return val + nextVal;
        else if (operator == 2)
            return val - nextVal;
        else if (operator == 3)
            return val * nextVal;
        else
            return val / nextVal;
    }
}

