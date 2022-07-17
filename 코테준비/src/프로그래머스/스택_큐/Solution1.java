package 프로그래머스.스택_큐;

import java.util.Stack;
//Lv2 기능개발
class Solution1 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        int day = 0;
        Stack<Integer> dayStack = new Stack<>();
        Stack<Integer> resultStack = new Stack<>();

        for(int i=0; i<progresses.length; i++){
            int progress = progresses[i] + speeds[i] * day;
            while(progress < 100){
                progress = progress + speeds[i];
                day++;
            }
            dayStack.push(day);
        }

        int num = dayStack.pop();
        int cnt = 1;
        while(!dayStack.isEmpty()){
            if(num == dayStack.peek()){
                cnt++;
                dayStack.pop();
            }else{
                resultStack.push(cnt);
                num = dayStack.pop();
                cnt = 1;
            }
        }
        resultStack.push(cnt);

        answer = new int[resultStack.size()];
        for(int i=0; i<answer.length; i++)
            answer[i] = resultStack.pop();

        return answer;
    }
}
