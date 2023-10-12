package StringMethods;

public class testexample {
	public static void main(String[] args) {
		int arr[]= {17,19,15,31,32,5};
		int newcount=test(arr);
		System.out.println(newcount);
	}

	private static int test(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++){
	    if(arr[i]%2==0){
	        count++;
	    }
	    else if(arr[i]%2==1){
	        if(arr[i]!=5){
	            count=count+3;
	        }
	        else{
	            count=count+5;
	        }
	    }
		
	}
	return count;

	}

}