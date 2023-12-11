package 선형구조_큐;

import java.util.LinkedList;

public class 백준큐문제_카드2 {

	public static void main(String[] args) {
		int x = 6;
		LinkedList<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= x; i++) {
			queue.add(i);
		}
		System.out.println(queue);
		for (int i = 0; i <= queue.size(); i++) {
			// 버리고
			System.out.println("버린 숫자 >> " + queue.remove());
			queue.add(queue.remove());
			System.out.println("맨 아래로 옮기기 >> "+queue);
		}
		queue.remove();
		System.out.println("마지막 남은 카드>> " + queue);
	}

}
