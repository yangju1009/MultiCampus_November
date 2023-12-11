package 배열기본;

import java.util.Arrays;
import java.util.Random;


public class 입력해서배열에넣기2 {
	
	public static void main(String[] args) {
//		11.1
//		22.2
//		33.3
//		44.4
//		55.5
		Random r = new Random();
		int[] numbers = new int[3];
		
		for (int i = 0; i < numbers.length; i++) {
			
			numbers[i] = r.nextInt();
		}
		System.out.println(Arrays.toString(numbers));
	}
}
