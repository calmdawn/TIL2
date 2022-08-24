package 백준.백준기타;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class No9466 {
    private static int teamCnt;
    private static List<Integer> groupList;

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
            teamCnt = n;
            groupList = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (isVisited[i] == false)
                    matchingTeam(i, isVisited, students);
            }
            bw.write(teamCnt + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void matchingTeam(int current, boolean[] isVisited, int[][] students) {
        isVisited[current] = true;
        groupList.add(current);
        int next = students[current][0];
        if (isVisited[next]) {    //다음에 선택할 학생이 이미 선택끝난 경우
            int locate = groupList.indexOf(next);
            if (locate >= 0)
                teamCnt = teamCnt - (groupList.size() - locate);
            groupList.clear();
        } else {
            matchingTeam(next, isVisited, students);
        }
    }
}
