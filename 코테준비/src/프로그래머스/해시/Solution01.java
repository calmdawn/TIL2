package 프로그래머스.해시;

import java.util.HashMap;

class Solution01 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> completeMap = new HashMap<>();
        for(String name : completion){
            if(completeMap.get(name) == null)
                completeMap.put(name, 1);
            else
                completeMap.put(name, completeMap.get(name) + 1);
        }

        for(String partiName : participant){
            if(completeMap.get(partiName) == null || completeMap.get(partiName) == 0){
                answer = partiName;
                break;
            }else
                completeMap.put(partiName, completeMap.get(partiName) -1);
        }

        return answer;
    }
}
