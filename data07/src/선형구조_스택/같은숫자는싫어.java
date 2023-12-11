package 선형구조_스택;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class 같은숫자는싫어 {

	public static void main(String[] args) {
		//{ 1, 1, 3, 3, 0, 1, 1 } 배열이 주어진다.
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(arr[0]); //peek() ==> 1
		System.out.println(stack);
		for (int i = 0; i < arr.length; i++) {
			if (stack.peek() != arr[i]) {
				stack.push(arr[i]);
			}
		}
		
		int[] answer = new int[stack.size()];
	}
}