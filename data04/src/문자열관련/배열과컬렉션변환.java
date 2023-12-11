package 문자열관련;

import java.util.Arrays;
import java.util.List;

public class 배열과컬렉션변환 {

	public static void main(String[] args) {
		String[] food = {"감자", "고구마", "우유", "감자", "양파"};
		List<String> list = Arrays.asList(food);
		//1. 감자가 들어있는 마지막 위치를 구해보세요. 전체 출력
		System.out.println(list.lastIndexOf("감자"));
		System.out.println(list);
		//2.양파를 포함하고있으면 "양파는 안사도된다.
		//		포함하고 있지 않으면 "양파사서 냉장고에 넣어야 한다."
		boolean t = list.contains("양파");
		if (t = true) {
			System.out.println("양파는 안사도된다");
		}else {
			System.out.println("양파사서 냉장고에 넣기");
		}
		System.out.println(list);
		//3. 우유를 "춘식이 우유"로 수정.
		list.set(2, "춘식이 우유");
		System.out.println(list);
		int index = list.indexOf("양파");
		list.set(index, "양파즙");
		System.out.println(list);

	}

	private static void stringPrint(String[] array) {
		System.out.println(Arrays.toString(array));
		
	}

}
