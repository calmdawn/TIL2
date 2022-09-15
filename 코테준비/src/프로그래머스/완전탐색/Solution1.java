package 프로그래머스.완전탐색;
//Lv1 최소직사각형

public class Solution1 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int lenMax = 0;  //가로길이 최대
        int heightMax = 0;//세로길이 최대

        //가로길이 < 세로길이인 경우 값을 swap
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }

        for (int i = 0; i < sizes.length; i++) {
            lenMax = Math.max(lenMax, sizes[i][0]);
            heightMax = Math.max(heightMax, sizes[i][1]);
        }
        answer = lenMax * heightMax;
        return answer;
    }
}
