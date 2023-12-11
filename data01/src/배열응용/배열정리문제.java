package 배열응용;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import 배열기본.Print;

public class 배열정리문제 {
	public static void main(String[] args) {
		//2. 랜덤 20개값, 값의 범위 0~899, 최대값 프린트
		Random r = new Random(5);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] n = new int[900];
		
		//3. 
		String s1 = "참좋다";
		String s2 = "진짜 참좋다";
		
		System.out.println(s1.equals(s2));
		if (s1.length() > s2.length()) {
			System.out.println("s1이 더 큼");
		}else {
			System.out.println("s2가 더 큼");
		}
		// 에서 "java programmer"만 추출하여 모두 대문자로
		String s3 = "나는 진짜 java programmer가 되었어.";
		System.out.println(s3.substring(6, 21)); //6~20
		String s33 = s3.substring(6, 21);
		System.out.println(s33.toUpperCase());
		
		String s4 = "2056521";
		char c = s4.charAt(0);
		if (c == '2' || c == '4') {
			System.out.println("여자임. ");
		}else {
			System.out.println("남자임. ");
		}
		String s5 = " [10, 20, 390, 401, 50]";
		s5 = s5.replace("[", " ");
		s5 = s5.replace("]", " ");
		System.out.println(s5);
		s5 = s5.trim();
		System.out.println(s5);
		String[] s6 = s5.split(", ");
		Print.arr(s6);
		int sum = 0;
		for (String s : s6) {
			sum += Integer.parseInt(s);
		}
		System.out.println(sum);
		
		int[] newArr = new int[s6.length];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = Integer.parseInt(s6[i]);
		}
		Print.arr(newArr);
		Arrays.sort(newArr);
		Print.arr(newArr);
		System.out.println("============");
		
		String s10 = "정길동";
		String s20 = "정길동";
		System.out.println(s10 == s20); //참조형은 주소 비교
		s10 = "홍길동";
		System.out.println(s10 == s20);
		//참조형에서 주소가 가리키는 값들이 동일한지 비교
		//함수를 이용해야함
		System.out.println(s10.equals(s20));
		
		s10 = "김길동";
		s20 = "박길동";
		//String이 변경될때는 새로운 메모리에 새로운 변경된
		//데이터를 입력함.(비효율적)
		StringBuilder sb = new StringBuilder();
		sb.append("홍길동");
		System.out.println(sb);
		sb.insert(0, "hahaha ");
		System.out.println(sb);
		String s30 = "푸하하굿바이";
		char[] c2 = s30.toCharArray();
		Print.arr(c2);
		char c3 = s30.charAt(0);
		System.out.println(c3);
		
	}
}
