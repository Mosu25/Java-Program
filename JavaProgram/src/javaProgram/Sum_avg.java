package javaProgram;

import java.util.Scanner;

public class Sum_avg {

	public static void main(String[] args) {
		
		//write a program to find the sum and average of given n number
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Limit: ");
		int inputLimit = sc.nextInt();
		int sum=0;
		int inputNum;
		
		for (int i=1; i<=inputLimit; i++) {
			
			System.out.println("Enter the Number "+i+ ": ");
			inputNum =sc.nextInt();
			sum+=inputNum; //sum = sum+inputNum;	
		}
		
		sc.close();
		System.out.println("The sum of given number is: " +sum);
		System.out.println("The average of given number is: " +sum/inputLimit);
		
	}

}
