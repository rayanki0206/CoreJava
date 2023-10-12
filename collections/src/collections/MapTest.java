package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map map1=new HashMap();
		map1.put("Name", "Vignesh");
		map1.put("Mobile", 8978143206l);
		map1.put("Email", "Vignesh@gmail.com");
		map1.put("Gender", 'M');
		map1.put(81.60, "Percentage");
		System.out.println("NEW MAPDATA :: \n"+map1);
		System.out.println();
		
		
		Map<String, Integer> map2=new HashMap<String, Integer>();
		map2.put("Student1", 1862);
		map2.put("Student2", 1876);
		map2.put("Student3", 1890);
		map2.put("Student4", 1026);
		map2.put("Student5", 1962);
		System.out.println("NEW MPADATA<STRING, INTEGER> TYPE :: \n"+map2);
		System.out.println();
		
				
		Map StudentInfo1=new HashMap();
		StudentInfo1.put("Name", "Harsha");
		StudentInfo1.put("Roll No", 38);
		StudentInfo1.put("Mobile", 9963548722l);
		StudentInfo1.put("Email", "harsha@gmail.com");
		StudentInfo1.put("Branch", "ECE");
		
		Map StudentInfo2=new HashMap();
		StudentInfo2.put("Name", "Sujan");
		StudentInfo2.put("Roll No", 24);
		StudentInfo2.put("Mobile", 9963253922l);
		StudentInfo2.put("Email", "sujan@gmail.com");
		StudentInfo2.put("Branch", "ECE");
		
		
		Map StudentInfo3=new HashMap();
		StudentInfo3.put("Name", "Dola sainath");
		StudentInfo3.put("Roll No", 34);
		StudentInfo3.put("Mobile", 9962065872l);
		StudentInfo3.put("Email", "dolasai@gmail.com");
		StudentInfo3.put("Branch", "ECE");
		
		Map StudentInfo4=new HashMap();
		StudentInfo4.put("Name", "Hashwanth");
		StudentInfo4.put("Roll No", 21);
		StudentInfo4.put("Mobile", 9963008722l);
		StudentInfo4.put("Email", "haswanth@gmail.com");
		StudentInfo4.put("Branch", "ECE");
		
		Map StudentInfo5=new HashMap();
		StudentInfo5.put("Name", "Dinesh");
		StudentInfo5.put("Roll No", 30);
		StudentInfo5.put("Mobile", 7862487220l);
		StudentInfo5.put("Email", "harsha@gmail.com");
		StudentInfo5.put("Branch", "ECE");
		
		Map StudentInfo6=new HashMap();
		StudentInfo6.put("Name", "Hemanth");
		StudentInfo6.put("Roll No", 35);
		StudentInfo6.put("Mobile", 7766548722l);
		StudentInfo6.put("Email", "harsha@gmail.com");
		StudentInfo6.put("Branch", "ECE");
		
		
		Map<String, String> employeeInfo1=new HashMap<String, String>();
		employeeInfo1.put("EmployeeName", "Surya");
		employeeInfo1.put("Roll No", "35");
		employeeInfo1.put("Mobile", "7766548722");
		employeeInfo1.put("Email", "surya@gmail.com");
		employeeInfo1.put("salary", "450000");
		
		Map<String, String> employeeInfo2=new HashMap<String, String>();
		employeeInfo2.put("EmployeeName", "Siva prasad");
		employeeInfo2.put("Roll No", "26");
		employeeInfo2.put("Mobile", "8900548722");
		employeeInfo2.put("Email", "Prasad@gmail.com");
		employeeInfo2.put("salary", "500000");
		
		
		Map<Integer,Map<String, String>> mapOfMap=new HashMap<Integer,Map<String, String>>();
		mapOfMap.put(35, employeeInfo1);
		mapOfMap.put(26, employeeInfo1);
		System.out.println("MAP OF MAP DATA :: \n"+mapOfMap);
		System.out.println();
		
		
		
		
		List list1=new ArrayList();
		list1.add(StudentInfo1);
		list1.add(StudentInfo2);
//		list1.add(StudentInfo3);
//		list1.add(StudentInfo4);
//		list1.add(StudentInfo5);
//		list1.add(StudentInfo6);
		System.out.println("LIST OF MAPDATA \n"+list1);
		System.out.println();
		
		
	}

}
