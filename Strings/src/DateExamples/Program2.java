package DateExamples;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Program2 {

	public static void main(String[] args) {
		DateExample2 dateExample2=new DateExample2();
		Date currentDate= dateExample2.getCurrentDate();
		LocalTime currentTime=dateExample2.getLocalTime();
		LocalDate localdate=dateExample2.getLocalDate();
		System.out.println(currentDate);
		System.out.println(currentTime);
		System.out.println(localdate);
		System.out.println(localdate);
		System.out.println(currentDate.compareTo(currentDate));
		System.out.println(currentTime.of(2, 30, 26));
		System.out.println(currentDate);
		

	}

}
