package 프로그래머스.기타;

import java.util.Stack;

//Lv1 카카오 2019 크레인 인형뽑기 게임
class Solution01 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        int height = board.length;
        int len = height;
        Stack<Integer>[] stackLines = new Stack[board.length + 1];
        Stack<Integer> basket = new Stack<>();
        for (int i = 1; i <= len; i++) {    //각 라인 초기화
            stackLines[i] = new Stack<>();
        }
        for (int i = height - 1; i >= 0; i--) {
            for (int j = 0; j < len; j++) {
                if (board[i][j] != 0)
                    stackLines[j + 1].push(board[i][j]);
            }
        }
        for (int i = 0; i < moves.length; i++) {
            if (!stackLines[moves[i]].isEmpty()) {    //해당 라인이 비어있지않은경우
                int doll = stackLines[moves[i]].pop();
                if (!basket.isEmpty() && (basket.peek() == doll)) {   //같은 인형이라면
                    basket.pop();
                    answer++;
                } else
                    basket.push(doll);
            }
        }

        return answer * 2;
    }
}
