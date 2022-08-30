package javaProgram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt(); //5
		sc.close();
		
		int f = 1;
		for (int i=1; i<=num; i++) { //1<=5, 2<=5, 3<=5, 4<=5, 5<=5 
			
			f=f*i; // 1*1=1, 1*2=2, 2*3=6, 6*4=24,24*5=120 
		}
		
		System.out.println("Factorial of " +num+ " is " +f);
	}

}
