package 프로그래머스.연습문제;

//Lv2 N개의 최소공배수
class Solution8 {
    public int solution(int[] arr) {
        int answer = 1;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = min * arr[i] / gcd(min, arr[i]);
        }
        answer = min;
        return answer;
    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
