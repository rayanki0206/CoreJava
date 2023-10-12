package exceptionHandling;

public class ExceptionCreator {
	public static void main(String[] args) throws Exception{
		ExceptionCreator exceptionCreator=new ExceptionCreator();
		int a=10, b=20, c=0;
		try {
			System.out.println(a/c);
		}
		catch(Exception e){
			System.out.println("divide by zero error");
		}
		
	}

}
