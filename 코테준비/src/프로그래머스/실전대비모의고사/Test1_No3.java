package 프로그래머스.실전대비모의고사;

import java.util.Stack;

class Test1_No3 {
    public int solution(int[] order) {
        int answer = 0;
        int maxSearch = 0;
        Stack<Integer> mainStack = new Stack<>();
        Stack<Integer> subStack = new Stack<>();

        for (int i = order.length; i > 0; i--)
            mainStack.push(i);

        for (int i = 0; i < order.length; i++) {
            int num = order[i];

            while (true) {
                if (!mainStack.isEmpty()) {
                    if (mainStack.peek() == num) {
                        answer++;
                        mainStack.pop();
                        break;
                    } else if (mainStack.peek() < num) {
                        subStack.push(mainStack.pop());
                    } else {
                        if (searchSub(num, subStack)) {
                            answer++;
                            break;
                        } else {
                            return answer;
                        }
                    }
                } else {
                    if (searchSub(num, subStack)) {
                        answer++;
                        break;
                    } else {
                        return answer;
                    }
                }
            }

        }

        return answer;
    }

    private static boolean searchSub(int num, Stack<Integer> subStack) {
        if (subStack.isEmpty() || subStack.peek() != num) {
            return false;
        }
        subStack.pop();
        return true;
    }
}