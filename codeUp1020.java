package codeUp;

import java.util.Scanner;

public class codeUp1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		String[] a = id.split("-");
		System.out.printf("%s%s", a[0], a[1]);
	}

}
