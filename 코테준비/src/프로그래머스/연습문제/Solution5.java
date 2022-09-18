package 프로그래머스.연습문제;

//Lv2 피보나치 수
public class Solution5 {
    public int solution(int n) {
        int answer = 0;
        int f0 = 0, f1 = 1;
        int f2 = 0;
        for (int i = 2; i <= n; i++) {
            f2 = (f0 + f1) % 1234567;
            f0 = f1;
            f1 = f2;
        }
        answer = f2;
        return answer;
    }
}
