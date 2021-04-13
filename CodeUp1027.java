package codeUp;

import java.util.Scanner;

public class CodeUp1027 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("연월일을 입력하세요");
		String koreanDate = sc.nextLine();
		String[] date = koreanDate.split("\\.");

		System.out.printf("%s-%s-%s", date[2], date[1], date[0]);

		sc.close();
	}
}
