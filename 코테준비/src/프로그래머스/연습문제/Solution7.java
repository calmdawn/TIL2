package 프로그래머스.연습문제;

//Lv2 멀리 뛰기
class Solution7 {
    public long solution(int n) {
        long answer = 0;
        if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        else {
            long f1 = 1, f2 = 2;
            long f3 = 0;
            while (n > 2) {
                f3 = (f1 + f2) % 1234567;
                f1 = f2;
                f2 = f3;
                n--;
            }
            answer = f3;
        }
        return answer;
    }

}
