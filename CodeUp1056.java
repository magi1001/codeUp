package codeUp;

import java.util.Scanner;

public class CodeUp1056 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		if ((A == 1 && B == 0) || (A == 0 && B == 1)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
