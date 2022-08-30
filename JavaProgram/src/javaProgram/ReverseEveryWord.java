package javaProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseEveryWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String: ");
		String orginalString = sc.nextLine();
		sc.close();
		String[] words = orginalString.split(" ");
		List<String> list = Arrays.asList(words);
		Collections.reverse(list);

		for(String word : list) {

			System.out.print(word+ " ");
		}
	}

}
