package 프로그래머스입문;

public class 피자나누기2 {

	public static void main(String[] args) {
		Solution7 s = new Solution7();
		int result = s.solution(4, 12); 
		System.out.println(result);
	}

}

class Solution7 {
	// n = 양꼬치주문수, k = 음료주문개수
	public int solution(int slice, int n) {
		int answer = 0;
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