package constructors;


public class SingleTon {
	
	int input1;
	int input2;
	int input3;
	
	
	public static SingleTon singleTon=null;
	
	private SingleTon() {
		
	}
	
	public static SingleTon getInstance() {
		if(singleTon==null) {
			return singleTon= new SingleTon();
			
		}
		return singleTon;
	}
}
