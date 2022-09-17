package 프로그래머스.연습문제;

import java.util.Arrays;

//Lv2 최솟값 만들기
class Solution3 {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        int len = A.length - 1;
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < A.length; i++) {
            answer = answer + A[i] * B[len - i];
        }
        return answer;
    }
}
