package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;

public class 문자열다루기기본 {

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		String s2 = "1234";
		boolean result = s.solution(s2);
		System.out.println(result);
	}
}

class Solution5 {
	public boolean solution(String x) {
		char[] c = x.toCharArray(); // {'a','2','3','4'}
        boolean answer = true;

        if (x.length() == 4 || x.length() == 6) {
            for (int i = 0; i < c.length; i++) {
                if (c[i] < '0' || c[i] > '9') {
                    answer = false;
                    break; // 더 이상 검사할 필요가 없으므로 루프 종료
                }
            }
        } else { //4와 6이 아닌 경우.
            answer = false;
        }

        return answer;
	}
}