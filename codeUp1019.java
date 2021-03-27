package codeUp;

import java.util.Scanner;

public class codeUp1019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		String[] arr = date.split("\\.");
		int [] arr2 = new int[arr.length]; // arr의 문자배열 수 만큼의 정수배열을 갖는 배열 arr2를 생성
		
		for(int i = 0; i < arr.length; i++) {
			arr2[i]=Integer.parseInt(arr[i]);	// 문자열배열 arr을 정수배열로 바꿔준다.
		}
		System.out.printf("%04d.%02d.%02d", arr2[0],arr2[1],arr2[2]);
 		sc.close();
	}

}
