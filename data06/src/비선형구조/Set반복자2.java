package 비선형구조;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set반복자2 {

	public static void main(String[] args) {
		String s = "abcabcabc";
		//1. 뭐가 들어가 있는지 파악하기
		//1-1. s에 들어있는 글자들을 분리시켜야한다.
		//1-2. 그 글자들을 중복을 제거한 채 모으면 된다.
		//		set을 이용
		String[] s2 = s.split(""); //{"a","c"....}
		List<String> list = Arrays.asList(s2);
		
		//asList()는 실제로. list를 따로 만드는 것은 아니고,
		//배열을 그대로 둔채 읽기 전용으로 list방식으로 접근만 가능한 방식
		
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < s2.length; i++) {
			set.add(s2[i]);
		}
		System.out.println(set); //[a, b, c, d]
		
		
		
		//2. 각 값이 몇 개씩 들어있는지를 세보자.
		Iterator<String> it = set.iterator(); //반복자를 만들어준다.
		
		String answer = "";
		for (int i = 0; i < set.size(); i++) {
			String s3 = it.next();
			System.out.println(s3 + ": ");
			System.out.println(Collections.frequency(list, s3));
			if (Collections.frequency(list, s3) == 1) {
				answer = answer + s3;
			}
		}//for
		System.out.println(answer);

	}

}
