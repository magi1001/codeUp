package codeUp;

import java.util.Scanner;

public class CodeUp1024 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		char data[] = new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			data[i] = word.charAt(i);
		}
		for (char i : data) {
			System.out.printf("'" + i + "'\n");
		}
	}
}