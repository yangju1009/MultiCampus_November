package 배열응용;

import java.util.Scanner;

public class String정리문제 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1) 양쪽 공백 제거
        System.out.print("전화번호 입력>> ");
        String n1 = scanner.nextLine().trim();

        // 2) -을 기준으로 분리
        String[] n2 = n1.split("-");

        // 3) 첫번째 문자열이 011이면 SK, 019이면 LG, 나머지는 Apple
        String company;
        if (n2[0].equals("011")) {
            company = "SK";
        } else if (n2[0].equals("019")) {
            company = "LG";
        } else {
            company = "Apple";
        }

        // 4) 두번째 문자열의 길이가 4개 이상이면 최신폰, 아니면 올드폰
        String phoneType = (n2[1].length() >= 4) ? "최신폰" : "올드폰";

        // 5) 전체 전화번호의 길이가 10글자 이상이면 유효한 전화번호, 아니면 유효하지 않는 전화번호
        String validity = (n1.length() >= 10) ? "유효한 전화번호" : "유효하지 않는 전화번호";

        // 결과 출력
        System.out.println("1) 양쪽 공백 제거: " + n1);
        System.out.println("2) -을 기준으로 분리: " + String.join(", ", n2));
        System.out.println("3) 첫번째 문자열의 회사: " + company);
        System.out.println("4) 두번째 문자열의 폰 종류: " + phoneType);
        System.out.println("5) 전체 전화번호의 유효성: " + validity);

        scanner.close();
    }

}
