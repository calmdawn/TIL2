package 백준.백준기타;

import java.io.*;
import java.util.StringTokenizer;

public class No9466 {
    private static int teamCnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int testCase = 0; testCase < T; testCase++) {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int[][] students = new int[n + 1][1];
            for (int i = 1; i <= n; i++)  //i번째 학생이 원하는 팀원
                students[i][0] = Integer.parseInt(st.nextToken());
            boolean[] isVisited = new boolean[n + 1];
            teamCnt = 0;
            for (int i = 1; i <= n; i++) {
                if (isVisited[i] == false)
                    matchingTeam(i, students[i][0], isVisited, students);
            }
            bw.write(teamCnt + "\n");
        }
        bw.flush();
        bw.close();
    }
    //처음 팀선택을 시작한 학생 == 현재 선택할 학생인경우 teamCnt++
    private static void matchingTeam(int prev, int current, boolean[] isVisited, int[][] students) {

    }


}
