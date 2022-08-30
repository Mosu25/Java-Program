package javaProgram;

public class ArraysCompareforWithoutEqualsMethod {

	public static void main(String[] args) {

		int[] a = {1,2,3,4,5};
		int[] b = {1,2,3,4,5,6};

		boolean comparisionStatus = true;

		if(a.length==b.length) {

			for (int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					comparisionStatus = false;
					break;
				}
			}
		}else {
			comparisionStatus =false;
		}

		if(comparisionStatus) {
			System.out.println("Both the arrays are equal");
		}
		else {
			System.out.println("Given Arrays are not equal");

		}
	}
}
