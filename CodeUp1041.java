package codeUp;

import java.util.Scanner;

public class CodeUp1041 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char x = sc.next().charAt(0);
		char y = (char)(x+1);
		System.out.println(y);
		sc.close();
	}
}
