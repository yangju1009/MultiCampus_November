package 비선형구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class K번째큰수 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		int[] n1 = { 22, 33, 66, 11, 10, 15 };
		System.out.println(Arrays.toString(n1));
		Arrays.sort(n1);
		System.out.println(Arrays.toString(n1));
		System.out.println(n1.length);
		System.out.println(n1[n1.length - 1]);
		System.out.println(n1[n1.length - 2]);
		// System.out.println(n1[n1.length - k]);

		int k = 3;
		int arr[] = { 22, 22, 44, 11, 11, 33, 55, 66, 77 };
		TreeSet<Integer> tree = new TreeSet<>();
		for (int i = 0; i < arr.length; i++) {
			tree.add(arr[i]);
		}
		System.out.println(tree);
		Object[] result = tree.toArray();
		System.out.println(k + "번째 큰 수 >> " + result[result.length - k]);

	}

}
