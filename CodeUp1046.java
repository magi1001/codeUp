package codeUp;

import java.util.Scanner;

public class CodeUp1046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextInt();
		long y = sc.nextInt();
		long z = sc.nextInt();
		long total = x + y + z;
		double avg = total / 3;
		System.out.println(total);
		System.out.printf(String.format("%.1f", (float) (x + y + z) / 3));
		sc.close();
		
	}
}
