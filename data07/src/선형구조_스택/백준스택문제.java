package 선형구조_스택;

import java.util.Stack;

public class 백준스택문제 {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		System.out.println(s.peek());
		System.out.println(s.size());
		System.out.println(s.empty()? 1 : 0);
		
		try {
			s.pop(); //2
			s.pop(); //1
			s.pop();
		} catch (Exception e) {
			System.out.println(-1);
		}

	}

}
