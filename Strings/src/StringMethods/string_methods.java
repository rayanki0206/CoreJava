package StringMethods;

public class string_methods {
	
	public static void main(String[] args) {
		String str="Hello, codeBegun";
		String str2="Hi";
		System.out.println(str.indexOf(9));
		System.out.println(str);
		System.out.println(str.trim());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.substring(3, 9));
		System.out.println(str.strip());
		System.out.println(str.startsWith("H", 1));
		System.out.println(str.startsWith("H"));
		System.out.println(str.contains("x"));
		System.out.println(str.concat(" Hi"));
		System.out.println(str.endsWith("n"));
		System.out.println(str.length());
		System.out.println(str.replace("Hello", "Hi"));
		System.out.println(str.equals(str2));
	}

}