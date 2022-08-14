package 백준.백준기타;

import java.io.*;
import java.util.*;

public class No10825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int langScore = Integer.parseInt(st.nextToken());
            int englishScore = Integer.parseInt(st.nextToken());
            int mathScore = Integer.parseInt(st.nextToken());
            studentList.add(new Student(name, langScore, englishScore, mathScore));
        }
        //comparable  1 : 값을 서로 바꿈

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student obj1, Student obj2) {
                if (obj1.langScore < obj2.langScore) {
                    return 1;
                } else if (obj1.langScore == obj2.langScore) {
                    if (obj1.englishScore < obj2.englishScore)
                        return -1;
                    else if (obj1.englishScore == obj2.englishScore) {
                        if (obj1.mathScore < obj2.mathScore) {
                            return 1;
                        } else if (obj1.mathScore > obj2.mathScore) {
                            return -1;
                        } else
                            return obj1.name.compareTo(obj2.name);
                    } else
                        return 1;
                }
                return -1;
            }
        });
        for (int i = 0; i < N; i++) {
            bw.write(studentList.get(i).name + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static class Student {
        String name;
        int langScore;
        int englishScore;
        int mathScore;

        public Student(String name, int langScore, int englishScore, int mathScore) {
            this.name = name;
            this.langScore = langScore;
            this.englishScore = englishScore;
            this.mathScore = mathScore;
        }
    }
}