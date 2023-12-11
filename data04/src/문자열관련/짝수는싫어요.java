package 문자열관련;

import java.util.Arrays;

public class 짝수는싫어요 {

	public static void main(String[] args) {
		Solution03 s = new Solution03();
		int n = 11; // 수정: 배열이 아니라 정수 값을 넘겨줌
		int[] result = s.solution(n);
		System.out.println(Arrays.toString(result));
	}
}

class Solution03 {
	public int[] solution(int n) {
		int size = (n % 2 == 0) ? n / 2 : n / 2 + 1;
		System.out.println(size);

		int[] answer = new int[size];
		int j = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				answer[j] = i;
				j++;
			}
		}

		return answer;
	}
}