package StringMethods;

import java.util.Arrays;

public class AnagramsCheck {
	
	private static boolean findAnangram(String str1, String str2) {
		str1=str1.replaceAll("\\s", "").toLowerCase();
		str2=str2.replaceAll("\\s", "").toLowerCase();
		
		if(str1.length() != str2.length()) {
			return false;
		}
		
		char[] charArray1=str1.toCharArray();
		char[] charArray2=str2.toCharArray();
		Arrays.sort(charArray2);
		Arrays.sort(charArray1);
		
		return Arrays.equals(charArray1, charArray2);
		
	}
	
	public static void main(String[] args) {
		
		String str1="Listen";
		String str2="silent";
		
		if(findAnangram(str1,str2)) {
			System.out.println("Given String "+str1+" and "+str2+" are anagrams");
		}
		else {
			System.out.println("Given String "+str1+" and "+str2+" are not anagrams");
		}
	}

}
