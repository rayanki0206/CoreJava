package Sunday;

public class ArrayProgram {
	
	public static void main(String[] args) {
		
		
		String[] str1= {"Vignesh", "haswanth", "Prasad", "Harsha"};
		String[] str2= {"CodeBegun", "Prasad", "Harsha", "Vishnu"};
		
		System.out.print("The common elements from both arrays are :: ");
		for(int i=0;i<str1.length;i++) {
			for(int j=0;j<str2.length;j++) {
				if(str1[i].contains(str2[j])) {

					System.out.print(str1[i]+" ");
				}
			}
			
		}
		
	}
	

}