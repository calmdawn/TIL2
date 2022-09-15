package 프로그래머스.완전탐색;

import java.util.HashSet;

//Lv2 소수 찾기
public class Solution3 {
    private static HashSet<Integer> hashSet;

    public int solution(String numbers) {
        int answer = 0;
        int len = numbers.length();
        boolean[] isVisited = new boolean[len];
        hashSet = new HashSet<>();
        //각 자리수별 숫자 추가
        //숫자들, depth, 방문여부, 현재까지의 숫자
        for (int i = 0; i < len; i++) {
            dfs(numbers, 0, isVisited, "0");
        }
        for (int n : hashSet) {
            answer = answer + checkPrime(n);
        }
        return answer;
    }

    private int checkPrime(int n) {
        if (n == 0 || n == 1)
            return 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return 0;
        }
        return 1;
    }

    private void dfs(String numbers, int depth, boolean[] isVisited, String num) {
        if (depth > numbers.length())
            return;
        hashSet.add(Integer.parseInt(num));
        for (int i = 0; i < numbers.length(); i++) {
            if (isVisited[i] == false) {  //아직 방문안한경우
                isVisited[i] = true;
                dfs(numbers, depth + 1, isVisited, num + numbers.charAt(i));
                isVisited[i] = false;
            }
        }

    }
}
