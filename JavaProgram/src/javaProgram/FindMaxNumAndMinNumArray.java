package javaProgram;

public class FindMaxNumAndMinNumArray {

	public static void main(String[] args) {

		int[] a = {2, 18, 45, 54, 98, 4, 1,35};

		// Logic for finding the maximum and minimum number in the given Array

		int max = a[0];
		int min = a[0];

		for (int i=0; i<a.length;i++) {

			if(max <a[i]) {

				max = a[i];

			}

			if(min>a[i]) {

				min = a[i];
			}

		}

		System.out.println("Maximum Number in the Given Array: "+ max +" Min Number in the Given Array: "+ min);
	}

}
