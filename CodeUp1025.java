package codeUp;

import java.util.Scanner;

public class CodeUp1025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int array[] = new int [a.length()];
		
		for(int i = 0; i<a.length(); i++) {
			array[i] = a.charAt(i)-'0';
		}
		System.out.println("["+array[0]*10000+"]");
		System.out.println("["+array[1]*1000+"]");
		System.out.println("["+array[2]*100+"]");
		System.out.println("["+array[3]*10+"]");	
		System.out.println("["+array[4]*1+"]");	
	}
}
