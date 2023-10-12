package StringMethods;

public class NoOfCharacters {
	public static void main(String[] args) {
		String str="I Love INDIA";
		str=str.replaceAll("\\s", "");
		int characterLength=str.length();
		System.out.println("The word \"" + str + "\" has " + characterLength + " characters.");
	}

}
