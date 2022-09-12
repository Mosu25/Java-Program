package javaProgram;

public class RemovingSpecialCharacters {

	public static void main(String[] args) {

		String s = "Mosu@#$%";
		
		String removingSpecialCharString = "";

		for (int i=0;i<s.length();i++) {
			
			if(!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))){
				
			}else {
				
				removingSpecialCharString = removingSpecialCharString +s.charAt(i);
			}
		}
		
			
		System.out.println("Special character removed String: "+removingSpecialCharString);
	}
	

}
