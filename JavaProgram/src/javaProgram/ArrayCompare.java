package javaProgram;

import java.util.Arrays;

public class ArrayCompare {

	public static void main(String[] args) {

		int [] a = {1,2,3,4};
		int [] b = {1,2,3,4};

		//Logic for checking whether these arrays are equals or not
		//Arrays.equals()

		if(Arrays.equals(a, b)){

			System.out.println("Both arrays are equal");

		} else {

			System.out.println("Given arrays are not Equal");
		}

	}

}
