package DateExamples;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program1 {
	
	
	static void date() {	
		Date dob;
		dob=new Date();
		System.out.println(dob);
	}
	
	public static void formatDate() {
		Date dob1;
		dob1=new Date();
		SimpleDateFormat sdf;
		sdf=new SimpleDateFormat("dd/MM/yy");
		sdf=new SimpleDateFormat("dd/mm/yyyy");
		System.out.println(sdf.format(dob1));
	
		
	}

}
