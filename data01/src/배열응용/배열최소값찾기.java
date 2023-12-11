package 배열응용;

import java.util.Arrays;
import java.util.Random;

import 배열기본.Print;

public class 배열최소값찾기 {

	public static void main(String[] args) {
		int[] n = {90, 80, 20, 60 ,70 };
		//최소값/최대값을 찾을 때는 
		//인덱스를 하나씩 옮기면서
		//거기까지의 최소값/최대값을 넣어둘 수 있는
		//변수를 따로 만들어주세요.
		//그 최소값/최대값보다 작거나 크면
		//최소값/최대값 넣어주느 변수가 변경됨.
		int min = n[0]; //첫번째 값 
		for (int x : n) {
			if (x < min) {
				min = x;
			}
		}
		System.out.println(min);
		
		//Random 객체 이용해서 최대값 찾기
		Random r = new Random();
		int[] n2 = new int[1000];
		int max = n2[0];
		for (int i = 0; i < n2.length; i++) {
			n2[i] = r.nextInt(1000);
			if (n2[i] > max) {
				max = n2[i];
			}
		}
		System.out.println("랜덤 숫자 >> " + Arrays.toString(n2));
		System.out.println("가장 큰 숫자>> " + max);
	}

}