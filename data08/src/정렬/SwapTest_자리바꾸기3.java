package 정렬;

import java.util.Arrays;

public class SwapTest_자리바꾸기3 {

	public static void main(String[] args) {
		String[] str = {"햄버거", "샌드위치", "커피"};
		print(str);
		swap(str, 1, 0);
	

	}
	
	private static void swap(String[] str, int idx1, int idx2) {
		String temp = str[idx2]; //temp <-- 1
		str[idx2] = str[idx1]; //{6, 6,...}
		str[idx1] = temp;
		print(str);
	}
	
	private static void print(String[] str) {
		System.out.println(Arrays.toString(str));

	}

}
