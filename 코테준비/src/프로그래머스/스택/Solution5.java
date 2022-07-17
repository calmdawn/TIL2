package 프로그래머스.스택;

import java.util.*;
//Lv1 같은 숫자는 싫어
class Solution5 {
    public int[] solution(int[] arr) {
        int[] answer;
        Stack<Integer> stack = new Stack<>();

        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (stack.peek() != arr[i])
                stack.push(arr[i]);
        }
        answer = new int[stack.size()];
        for (int i = answer.length - 1; i >= 0; i--)
            answer[i] = stack.pop();

        return answer;
    }
}
