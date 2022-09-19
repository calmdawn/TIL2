package 프로그래머스.연습문제;

//Lv2 다음 큰 숫자
public class Solution6 {
    public int solution(int n) {
        int answer = 0;
        int oneCnt = getCount(n);
        n++;
        while (oneCnt != getCount(n))
            n++;
        answer = n;
        return answer;
    }

    private int getCount(int n) {
        int cnt = 0;
        while (n > 0) {
            if (n % 2 == 1)
                cnt++;
            n = n / 2;
        }
        return cnt;
    }
}
