package $1D_Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int [] a= {10,20,30,40,50,60};
		System.out.println("The content of the array is ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("The reverse order of the array is ");
		for(int i=5;i>=0;i--) {
			System.out.println(a[i]);
		}
	}

}
