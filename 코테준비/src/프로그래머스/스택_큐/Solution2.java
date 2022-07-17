package 프로그래머스.스택_큐;

import java.util.*;
//Lv2 프린터
class Solution2{
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Integer[] prioSort = new Integer[priorities.length];

        Queue<Integer> roundQueue = new LinkedList<>();

        for(int i=0; i<priorities.length; i++){
            prioSort[i] = priorities[i];
            roundQueue.offer(priorities[i]);
        }

        Arrays.sort(prioSort, Collections.reverseOrder());

        int idx = 0;
        while(!roundQueue.isEmpty()){
            if(roundQueue.peek() == prioSort[idx]){  //우선순위가 가장 높을때
                roundQueue.poll();
                answer++;
                idx++;
                if(location == 0)
                    break;
            }else{
                roundQueue.offer(roundQueue.poll());
            }
            location--;
            if(location<0)
                location = roundQueue.size()-1;
        }

        return answer;
    }
}