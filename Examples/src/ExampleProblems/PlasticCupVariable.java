package ExampleProblems;

public class PlasticCupVariable {
	public static void main(String[] args) {
		String str="plastic cup";
		StringBuilder result=variable(str);
		System.out.println(result);
//		StringBuilder sb=new StringBuilder();
//		int indexOfSpace=str.indexOf(" ");
//		String finalStr=str.replace(" ", "");
//		System.out.println(indexOfSpace);
//		System.out.println(finalStr);
		

		
	}
	private static StringBuilder variable(String str) {
		char[] ch=str.toCharArray();
		StringBuilder Sb=new StringBuilder();
		boolean capitalizeNext=false;
		
		for(char element:ch) {
			if(Character.isSpaceChar(element)) {
				str.replace(" ", "");
				capitalizeNext=true;
			}
			else {
				if(capitalizeNext) {
					Sb.append(Character.toUpperCase(element));
					capitalizeNext=false;
				}else {
					Sb.append(element);
				}
				
			}

		}
		return Sb;
	}

}
