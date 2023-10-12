package StringMethods;

public class FindWord {

	public static void main(String[] args) {
		String str="Fox kills the king of the forest";
		String find="forest";
		
		
		//indexOf method for finding a word
		int i=str.indexOf(find);
		if(i>0)
		System.out.println(str.substring(i, i+find.length()));
		else {
			System.out.println("string not found");
		}
		
		
		
		//contains method for finding a word
		boolean val=str.contains(find);
		if(val) {
			System.out.println("String found ::"+find);
		}
		else {
			System.out.println("String not found");
		}
		

	}

}
