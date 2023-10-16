package ExampleProblems;

public class PlasticCup {
	public static void main(String[] args) {
		String str="plasticCupCup()";
		StringBuilder result=lowerCase(str);
		System.out.println(result);
		
		
	}
	
	static StringBuilder lowerCase(String str) {
		char[] ch=str.toCharArray();
		StringBuilder Sb=new StringBuilder();
		
		for(char element:ch) {
			if(Character.isUpperCase(element)) {
				Sb.append(" ");
				Sb.append(Character.toLowerCase(element));
				
			}
			else {
				if(element=='(' || element==')') {
					continue;
				}
				Sb.append(element);
			}

		}
		return Sb;
		
	}

}
