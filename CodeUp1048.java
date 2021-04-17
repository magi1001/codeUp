package codeUp;

import java.util.Scanner;

public class CodeUp1048 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		if (0 <= a && a <= 10 && 0 <= b && b <= 10) {
		int result = a << b;
		System.out.println(result);
		} else {
			return ;
		}
	}
}
