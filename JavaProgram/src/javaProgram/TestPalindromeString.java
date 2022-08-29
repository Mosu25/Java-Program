package javaProgram;

import java.util.Scanner;

public class TestPalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the String: ");
		String originalString = sc.nextLine();
		sc.close();
		char[] ca = originalString.toCharArray();
		String reversedString = "";
		int size = ca.length;

		for (int i=size-1; i>=0; i--) {

			reversedString = reversedString + ca[i];
		}

		if (originalString.equals(reversedString)) {

			System.out.println(originalString+ " is a Palindrome");

		}else {

			System.out.println(originalString+ " is not a Palindrome");

		}

	}


}
