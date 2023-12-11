package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;

public class 문자열밀기 {

	public static void main(String[] args) {
		Solution10 s = new Solution10();
		int result = s.solution("apple", "elppa");
		System.out.println(result);
	}
}

class Solution10 {
	public int solution(String A, String B) {

		return(B + B).indexOf(A);
	}
}