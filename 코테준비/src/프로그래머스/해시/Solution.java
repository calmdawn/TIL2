package 프로그래머스.해시;

import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int N = nums.length;
        int totalCnt = 0;

        HashMap<Integer, Boolean> pokemons = new HashMap<>();
        for (int num : nums)
            pokemons.put(num, true);
        totalCnt = pokemons.size();

        if (totalCnt >= N / 2)
            answer = N / 2;
        else
            answer = totalCnt;

        return answer;
    }
}
