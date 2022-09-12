package javaProgram;

public class DemoStringReverse {
	
	
	public void UsingBuffer() {

		String s = "Mosu";
		System.out.println(s);
		StringBuffer buffer = new StringBuffer();
		buffer.append(s);
		System.out.println(buffer.reverse());
	}

	
	public void UsingOwnLogic() {

		String s = "Mosu";
		String rev = "";
		char[] charArray = s.toCharArray();
		for (int i=charArray.length-1; i>=0;i--) {

			rev = rev+charArray[i];
		}

		System.out.println(rev);

	}
	
	
//	public void usingCollection() {
	//		
	//		String s = "Mosu";
	//		char[] carr = s.toCharArray();
	//		List<Character> list = new ArrayList<Character>();
	//		
	//		
	//		
	//		
	//	}

	
	
	
	
	public static void main(String[] args) {
		
		DemoStringReverse revstr = new DemoStringReverse();
		revstr.UsingOwnLogic();
		revstr.UsingBuffer();		
			
	}

}
