package justDoIt;

import java.util.Scanner;

public class codeup1018 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Scanner 객체 생성
		String clock = sc.nextLine(); // 문자열 입력 받음 
		String[] arr = clock.split(":"); // ':'을 기준으로 문자열을 구분
		System.out.printf("%s:%s", arr[0], arr[1]); // 분할 문자열을 출력
		sc.close(); // Scanner 닫기

	}
}
