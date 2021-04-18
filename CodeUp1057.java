package codeUp;

import java.util.Scanner;

public class CodeUp1057 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		if (A == B && (A == 1 || A == 0) && (B == 1 || B == 0)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
