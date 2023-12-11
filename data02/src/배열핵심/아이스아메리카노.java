package 배열핵심;

import java.util.Arrays;

public class 아이스아메리카노 {
	
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int result[] = s.solution(20000);
		System.out.println(Arrays.toString(result));
	}
}

class Solution2 {
    public int[] solution(int money) {
        int[] answer = {0, 0};
        int cof = 5500;
        int count = 0;
        if (money < cof) {
			answer[1] = money;
		}else {
			answer[0] = money / cof;
			answer[1] = money % cof;
		}
        return answer;
    }
}