package javaProgram;

import java.util.Scanner;

public class TestReverseString {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Please Enter the String: ");
	String originalString = sc.nextLine();
	sc.close();
	char[] ca = originalString.toCharArray();
	int size = ca.length;
	String reversedString = "";
	
	for (int i=size-1; i>=0;i--) {
		
		reversedString = reversedString + ca[i];
		
	}
	
	System.out.println(reversedString);
	

	}

}
