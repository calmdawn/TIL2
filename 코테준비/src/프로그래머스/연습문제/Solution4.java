package 프로그래머스.연습문제;
//Lv2 숫자의 표현
class Solution4 {
    public int solution(int n) {
        int answer = 0;
        int left = 1, right = 1;
        int sum = 0;
        while (true) {
            if (sum == n) {
                sum = sum - left++;
                answer++;
            } else if (sum < n) {
                sum = sum + right++;
            } else if (sum > n) {
                sum = sum - left++;
            }
            if (left == n + 1 && right == n + 1)
                break;
        }
        return answer;
    }
}
