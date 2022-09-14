package 프로그래머스.정렬;

import java.util.Arrays;
import java.util.Comparator;

//Lv2 가장 큰 수
class Solution2 {
    public String solution(int[] numbers) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        String[] nums = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(nums, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int flag = checkSize(o1, o2);
                return flag;
            }
        });
        for (String s : nums)
            sb.append(s);
        answer = sb.toString();
        if (answer.charAt(0) == '0')
            return "0";
        return answer;
    }

    private int checkSize(String o1, String o2) {
        int num1 = Integer.parseInt(o1 + o2);
        int num2 = Integer.parseInt(o2 + o1);

        return num2 - num1;
    }
}