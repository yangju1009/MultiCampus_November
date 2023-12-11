package 프로그래머스입문;

public class 옷가게할인 {

	public static void main(String[] args) {
		Solution8 s = new Solution8();
		int result = s.solution(8); 
		System.out.println(result);
	}

}

class Solution8 {
    public int solution(int price) {
        int rate = 0;

        // 할인율 계산
        if (price >= 500000) {
            rate = 20;
        } else if (price >= 300000) {
            rate = 10;
        } else if (price >= 100000) {
            rate = 5;
        }

        // 할인된 가격 계산
        int answer = price - (price * rate / 100);

        return answer;
    }
}
