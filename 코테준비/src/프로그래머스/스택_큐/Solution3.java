package 프로그래머스.스택_큐;

import java.util.Stack;

//Lv2 올바른 괄호
public class Solution3 {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                stack.push(s.charAt(i));
            else {
                if (stack.isEmpty())
                    return false;
                else if (stack.peek() == '(')
                    return false;
                stack.pop();
            }
        }
        if(!stack.isEmpty())
            return false;
        return answer;
    }
}
