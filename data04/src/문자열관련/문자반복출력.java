package 문자열관련;

import java.util.Arrays;

public class 문자반복출력 {

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		String result = s.solution("hello", 3);
		System.out.println(result);
	}
}

class Solution5 {
	public String solution(String my_string, int n) {
		char[] c = my_string.toCharArray();
		System.out.println(c.length);
		System.out.println(my_string);
		String answer = "";
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < n; j++) {
				answer += c[i];
			}
		}
		return answer;
	}
}