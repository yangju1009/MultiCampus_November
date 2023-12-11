package 문자열관련;

import java.util.Arrays;

public class Base {

	public static void main(String[] args) {
		Solution0 s = new Solution0();
		int result = s.solution("olleh", "hello");
		System.out.println(result);
	}
}

class Solution0 {
	public int solution(String before, String after) {
		int answer = 0;
		char[] a = before.toLowerCase().toCharArray();
		char[] b = after.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if (Arrays.equals(a, b)) {
			answer = 1;
		}else {
			answer = 0;
		}
		
		return answer;
	}
}