package StringMethods;

public class test1 {
	static void printString(String s) {
		if(s.length()==0) {
			return;
		}
		else {
			System.out.print(s.charAt(0));
			printString(s.substring(1));
		}
	}
	
	public static void printReverse(String s) {
		  if (s.length() > 0) {      // Recursive case:
		     printReverse(s.substring(1));  // Print tail
		     System.out.print(s.charAt(0)); // Print first char
		  }
	}
	
	
	public static void main(String[] args) {
		printString("Vignesh");
		System.out.println("");
		printReverse("example");
	}
}
