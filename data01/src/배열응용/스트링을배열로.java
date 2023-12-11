package 배열응용;

public class 스트링을배열로 {

	public static void main(String[] args) {
		String all = "국어, 영어, 수학, 컴퓨터";
		//1. String[]로 바꾸기
		String[] all2 = all.split(",");
		System.out.println(all2.length);
		System.out.println(all2[1]);
		//2. 바꾸었더니 공백이 포함되면 공백 제거 후,
		// 다시 배열에 넣기.
		for (int i = 0; i < all2.length; i++) {
			if (all2[i].contains(" ")) {
				all2[i] = all2[i].trim();
			}
		}
		System.out.println(all2[1]);

	}

}
