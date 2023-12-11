package 배열기본;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열결과리스트에넣기 {
	
	public static void main(String[] args) {
		int[] n = {100, 200, 300, 400, 500};
		
		//1. 전체목록 프린트
		System.out.println(Arrays.toString(n));
		//2. 300이상 값이 몇 개 인지 카운트해서 프린트'
		int count = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n.length; i++) {
			if (n[i] >= 300) {
				count++;
			}
		}
		System.out.println("300이상 수는 " + count + "개 입니다");
		//3. 300이상 들어있는 위치를 arraylist에 모으세요.
		for (int i = 0; i < n.length; i++) {
			if (n[i] >= 300) {
				list.add(i);
			}
		}
		System.out.println(count);
		System.out.println(list);
		//4. arraylist안 인덱스에 배열의 값들에서 100만큼 빼주세요.
		for (Integer index : list) {
			n[index] = n[index] - 100;
			//n[index] -= 100;
		}
		
		//5. 수정된 배열 전체 프린트
		//System.out.println(Arrays.toString(n));
		Print.arr(n);
	}
}
