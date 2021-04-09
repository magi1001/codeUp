package codeUp;

import java.util.Scanner;

public class CodeUp1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String time = sc.nextLine();	// 시간을 입력받는 String 타입의 변수 time 생성
		String data[] = time.split(":");	// ":"으로 쪼개지는 String 타입을 갖는 배열 data생성
		int array[] = new int[data.length];	// data의 문자배열 수 만큼 정수 배열을 갖는 배열 array생성
		
		for(int i = 0; i < data.length; i++) {
			array[i] = Integer.parseInt(data[i]);	// String 타입을 int타입으로 변환하여 array[i]에 대입
		}
		System.out.println(array[1]);	// 분만 출력하기 위해 array[1]번째를 출력한다.
	}
}
