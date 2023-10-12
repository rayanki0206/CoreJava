package StringMethods;

public class StringPrimitives {
	public static void main(String[] args) {
		char[] str1= {'h','e','l','l','o',' ', 'W','o','r','l','d'};
		String str="Hello  world     Vignesh";
		StringBuffer s1=new StringBuffer();
		String s2="e";
		
		
		System.out.println(str1);
		System.out.println(str1.length);
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.charAt(1));
		System.out.println(str.concat(str));
		System.out.println(s1.append(str));
		System.out.println(s1.reverse());
		System.out.println(str1.toString());
		System.out.println(str.length());
		System.out.println(str.substring(2,4));
		System.out.println(s2.length());
		
		

		
		
	}

}
