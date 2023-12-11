package 배열핵심;

public class 배열의평균 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		Solution s = new Solution();
		double result = s.solution(numbers);
		System.out.println(result);
	}
}

class Solution {
	public double solution(int[] numbers) {
		double answer = 0;
		//평균 <= 합/개
		int sum = 0;
		for (int x : numbers) {
			sum = sum + x;
		}
		answer = (double)sum / numbers.length; //5.0
		for (int i = 0; i < numbers.length; i++) {
			
		}
		return answer;
	}
}