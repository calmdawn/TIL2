package 프로그래머스.깊이_너비우선탐색;

//Lv2 타겟 넘버
class Solution1 {
    private static int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, 0, 0, target);
        return answer;
    }

    private void dfs(int[] numbers, int curIdx, int depth, int sum, int target) {
        if (depth == numbers.length) {    //모든 계산을 한 경우
            if (sum == target)
                answer++;
            return;
        }
        dfs(numbers, curIdx + 1, depth + 1, sum + numbers[curIdx], target);
        dfs(numbers, curIdx + 1, depth + 1, sum - numbers[curIdx], target);
    }
}
