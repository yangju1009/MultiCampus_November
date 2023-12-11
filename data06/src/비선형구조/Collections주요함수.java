package 비선형구조;

import java.util.ArrayList;
import java.util.Collections;

public class Collections주요함수 {

	public static void main(String[] args) {
		int[] s = { 3, 5, 6, 7, 8, 11, 34, 90, 102 };

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < s.length; i++) {
			list.add(s[i]);
		}
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list));
		Collections.sort(list);
		System.out.println(list.get(2));
		System.out.println(Collections.frequency(list, 3));
		System.out.println("6이 없나요? >> " + !list.contains(6));
		System.out.println("6의 인덱스>> " + list.indexOf(6));
		list.clear(); // 내용 지우기
		System.out.println(list);

	}

}
