package 프로그래머스.힙;
//Lv2 더 맵게

import java.util.PriorityQueue;

class Solution1 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++)
            minHeap.offer(scoville[i]);
        while (true) {
            if (minHeap.peek() >= K)  //모든 스코빌 지수가 K보다 큰경우
                break;
            else {
                if (minHeap.size() <= 1)
                    return -1;
                minHeap.offer(minHeap.poll() + minHeap.poll() * 2);
                answer++;
            }
        }
        return answer;
    }
}
