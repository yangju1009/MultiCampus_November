package 선형구조_스택;


import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class 제일작은수제거하기_stack {

	public static void main(String[] args) {
		int[] n = { 4, 3, 2, 1, 5 }; //==> {4,3,2,5}
		Arrays.sort(n);
		Stack<Integer> stack = new Stack<>();
	
		for (int i = 0; i < n.length; i++) {
			stack.push(n[i]);
		}
		System.out.println(stack);
		//최소값을 찾아라.
		int min = Collections.min(stack);
		System.out.println(min);
		
		//최소값을 지우세요.
		stack.remove(stack.indexOf(min));
		System.out.println(stack);
		
		int[] answer = new int[n.length -1];//0~3
//		for (int i = 0; i < answer.length; i++) {
//			answer[i] = stack.pop();
//		}
		for (int i = answer.length -1; i >= 0; i--) {
			answer[i] = stack.pop();
		}
		System.out.println(Arrays.toString(answer));
	}

}