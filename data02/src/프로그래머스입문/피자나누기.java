package 프로그래머스입문;

public class 피자나누기 {

	public static void main(String[] args) {
		Solution6 s = new Solution6();
		int result = s.solution(8); 
		System.out.println(result);
	}

}

class Solution6 {
	// n = 양꼬치주문수, k = 음료주문개수
	public int solution(int n) {
		int answer = 0;
		int slice = 7; // 피자 조각 갯수

		if (n < slice) { // 4, 5 < 7
			answer = 1;
		}
		if (n % slice == 0) {
			answer = n / slice;
		} else {
			answer = n / slice + 1;
		}
		return answer;
	}
}