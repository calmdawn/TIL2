package 프로그래머스.연습문제;

import java.util.StringTokenizer;

//Lv2 최댓값과 최솟값
public class Solution1 {
    public String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        answer = min + " " + max;
        return answer;
    }
}
