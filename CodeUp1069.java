package codeUp;

import java.util.Scanner;

public class CodeUp1069 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
		char x = sc.next().charAt(0);

		if (x == 'A') {
			System.out.println("best!!!");
		} else if (x == 'B') {
			System.out.println("good!!!");
		} else if (x == 'C') {
			System.out.println("run!");
		} else if (x == 'D') {
			System.out.println("slowly~");
		} else {
			System.out.println("what?");
		}
	}
}
