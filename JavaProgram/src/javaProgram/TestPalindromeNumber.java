package javaProgram;

import java.util.Scanner;

public class TestPalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Number: ");
		int originalNumber = sc.nextInt();
		int number = originalNumber;
		sc.close();
		int reversedNumber = 0;

		while(number!=0) {

			int reminder = number % 10 ;
			reversedNumber = ( reversedNumber * 10 ) + reminder ;
			number = number/10;


		}

		if (originalNumber == reversedNumber) {

			System.out.println(originalNumber+ " is a Palindrome");
			
		}else {

			System.out.println(originalNumber+ " is not a Palindrome");
		}

	}

}
