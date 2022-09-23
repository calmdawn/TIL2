package 프로그래머스.연습문제;

class Solution11 {
    public int solution(int n) {
        int x = 1;
        while(true){
            if(n % x == 1 )
                return x;
            x++;
        }
    }
}
