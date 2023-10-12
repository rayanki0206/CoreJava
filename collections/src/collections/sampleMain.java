package collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class sampleMain {

	public static void main(String[] args) {
		SampleInput sampleinput=new SampleInput();
		SampleInput sampleinput1=new SampleInput();
		
		Integer testArray[]= {1,2,3,4,5};
		
		sampleinput.setStudentId(1678);
		sampleinput.setStudentName("Vignesh");
		sampleinput.setMobileNumber(8978143206l);
		sampleinput.setEmail("rayankivignesh@gmail.com");
		
		sampleinput1.setStudentId(1679);
		sampleinput1.setStudentName("haswanth");
		sampleinput1.setMobileNumber(7998237390l);
		sampleinput1.setEmail("addanki@gmail.com");
		
		SampleInput[] sampleInputArray= {sampleinput,sampleinput1};	
		
		for(Integer element:testArray) {
			System.out.print(" "+element);
		}
		System.out.println();
		
		System.out.println(sampleinput);
		System.out.println(sampleInputArray);
		System.out.println();
		
		
		List list =new ArrayList<>();				//Generic list type
		
		list.add(20);
		list.add("Hello world!");
		list.add("Hello world!");
		list.add('C');
		list.add(true);
		list.add(26.7);
		list.add(26.7);
		list.add(new Date());
		list.add(8978145406l);
		list.add(sampleinput);
		list.add(sampleinput1);
		
		System.out.println("NEW GENERIC LIST :: "+list);
		System.out.println();
		
		
		List<Integer> list1 =new ArrayList<Integer>();						//specific list wrapper class type
																/* Note: primitive types are not allowed to give type  */
		list1.add(20);
		list1.add(75);
		list1.add(54);
//		list1.add("Hello world!");
//		list1.add('C');
//		list1.add(true);
//		list1.add(26.7);
//		list1.add(new Date());
//		list1.add(8978145406l);
//		list1.add(sampleinput);
//		list1.add(sampleinput1);
		System.out.println("NEW SPECIFIC DATA TYPE LIST :: "+list1);
		
		
		List<SampleInput> list3=new ArrayList<SampleInput>();			// specific class type list
		System.out.println();
		
		for(SampleInput element:sampleInputArray) {
			System.out.println(" StudentName :: "+element.studentId);
			System.out.println(" StudentName :: "+element.studentName);
			System.out.println(" StudentName :: "+element.mobileNumber);
			System.out.println(" StudentName :: "+element.Email);
			System.out.println();
		}
		
		
		Set set1 =new HashSet<>();					// Set is almost similar to the list, but doesn't allow duplicate values
		
		set1.add(90);
		set1.add(20);
		set1.add(150);
		set1.add(50);
		set1.add(20);
		set1.add(50);
		set1.add("Hello world!");
		set1.add('C');
		set1.add(true);
		set1.add(26.7);
		set1.add(new Date());
		set1.add(8978145406l);
		set1.add(sampleinput);
		set1.add(sampleinput1);
		
		System.out.println("NEW SET :: "+set1);				//HashSet follows Hashcode to sort the elements in random order
		System.out.println();
		
		
		Set set2=new HashSet(list);
		System.out.println("LIST TO SET ::  "+set2);		//Passing ArrayList as a parameter to HashSet
		System.out.println();
		
		Set set3=new TreeSet<>();							// TreeSet can only allow homogeneous data & follows ascending order
		set3.add("Vignesh");
		set3.add("Hashwanth");
		set3.add("Addanki");
		System.out.println("TREESET OF STRING TYPE :: "+set3);
		System.out.println();
		
		
		Set set4=new TreeSet<>();							//TreeSet follows ascending order
		set4.add(500);
		set4.add(25);
		set4.add(100);
		set4.add(5);
		set4.add(750);
		set4.add(250);
		System.out.println("TREESET OF INTEGER TYPE :: "+set4);
		System.out.println();
		
		
		Set set5=new HashSet<>();							//TreeSet follows ascending order
		set5.add(500);
		set5.add(25);
		set5.add(100);
		set5.add(5);
		set5.add(750);
		set5.add(250);
		System.out.println("HASHSET OF INTEGER TYPE :: "+set5);
		
		
		
		
	}

}
