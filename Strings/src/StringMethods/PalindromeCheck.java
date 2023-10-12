package StringMethods;

public class PalindromeCheck {

	static boolean stringCheck(String s) {
		if(s.length()==1 || s.length()==0) {
			return true;
		}
		if(s.charAt(0)==s.charAt(s.length()-1)) {
			return stringCheck(s.substring(1, s.length()-1));
		}
		return false;
	}
	
	public static void main(String[] args) {
		boolean flag=stringCheck("pomengranate");
		System.out.println(flag);
	}

}
