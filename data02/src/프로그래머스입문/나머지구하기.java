package 프로그래머스입문;

public class 나머지구하기 {
	public static void main(String[] args) {
		Solution1 s1 = new Solution1();
		int result1 = s1.solution1(3, 2);
		System.out.println(result1);
	}
}

class Solution1 {
    public int solution1(int num1, int num2) {
        double answer = ((double)num1 / num2) * 1000;
        return (int) answer;
    }
}