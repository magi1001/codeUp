package codeUp;

import java.util.Scanner;

public class CodeUp1023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pi = sc.nextDouble();

		String [] arr = String.valueOf(pi).split("\\.");
		for(String a : arr) {
			System.out.println(a);
		}
	
	}

}
