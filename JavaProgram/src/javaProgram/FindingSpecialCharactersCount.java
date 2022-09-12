package javaProgram;

public class FindingSpecialCharactersCount {

	public static void main(String[] args) {
		
		String str = "Mosu!#";
		
		int count = 0;
		
		for (int i=0; i<str.length();i++) {
			
			if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i))
			&& !Character.isWhitespace(str.charAt(i))){
				count++;
			
		}

	}

		if(count==0) {
			System.out.println("There are no special character in provided string");
		}else {
			System.out.println("Special character counts in given string "+count);
		}
}
}
