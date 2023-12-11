package 프로그래머스입문;

public class 양꼬치1 {
	public static void main(String[] args) {
		Solution5 s = new Solution5();
		int result = s.solution(64, 6);
		System.out.println(result);
	}
}

class Solution5 {
    //n = 양꼬치 주문수, k = 음료주문개수
	public int solution(int n, int k) {
        int answer = 0;
        int total = 0; //무료로 받을 수 있는 음료개수
        if (n >= 10) {
			total = n/10;
		}
        //전체 지불금액 = 양꼬치주문금액 + 음료수주문금액
        answer = n * 12000 + (k - total) * 2000;
        return answer;
    }
}