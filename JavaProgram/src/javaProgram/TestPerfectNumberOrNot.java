package javaProgram;

import java.util.Scanner;

public class TestPerfectNumberOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int number = sc.nextInt();
		sc.close();
		int sum = 0;

		for (int i=1; i<number; i++ ) {

			if(number % i == 0) {

				sum = sum + i ;
			}


		}
		if(number==sum) {

			System.out.println("Given number is perfect number");
		}else {
			System.out.println("Given number is not perfect number");
		}


	}

}


