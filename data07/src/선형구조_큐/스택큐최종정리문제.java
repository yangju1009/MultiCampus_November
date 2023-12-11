package 선형구조_큐;

import java.util.LinkedList;
import java.util.Stack;

public class 스택큐최종정리문제 {

	public static void main(String[] args) {
		//1.Stack
		String[] food = {"apple", "apple", "apple", "banana", "banana", "melon", "melon", "berry"};
		Stack<String> stack = new Stack<>();
		stack.push(food[0]); //apple --> stack.peek();
		for (int i = 0; i < food.length; i++) {
			stack.push(food[i]);
		}
		System.out.println(stack);
		
		//2.Queue
		
		String[] wait = {"홍길동", "김길동", "송길동", "정길동", "박길동", "이길동"};
		LinkedList<String> queue = new LinkedList<String>();
		for (int i = 0; i < wait.length; i++) {
			queue.add(wait[i]);
		}
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		
	}
	
		
}
