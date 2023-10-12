package StringMethods;

public class BigNumber {
	
	static int largeNumber(int[] arr) {
		int Lnumber=arr[0];
		for( int i=0; i<arr.length;i++) {
			if(arr[i]>=Lnumber) {
				Lnumber=arr[i];
			}
		}
		return Lnumber;
	}
	
	public static void main(String[] args) {
		int[] arr= {12,2,45,76,22,64,98,99,108};
		System.out.println(largeNumber(arr));
	}

}
