package MethodOverloading;

public class StudentInfo1 {
	StudentDetails1 getStudent() {
		
		StudentDetails1 stuData=new StudentDetails1();
		BasicInfo1 Basicinfo=new BasicInfo1();
		AddressInfo1 addInfo=new AddressInfo1();
		
		stuData.setStudentId("APR347987");
		stuData.setCollegeName("Narayana junior college");
		stuData.setCourse("Intermediate");
		stuData.setStream("MPC");
		stuData.setDuration((short) 2);
		stuData.setDateOfJoining("02/06/2019");

	
		
		
		Basicinfo.setFirtsName("Vignesh");
		Basicinfo.setLastName("Rayanki");
		Basicinfo.setGender("M");
		Basicinfo.setAge((short)22);
		Basicinfo.setEmailId("rayankivignesh@gmail.com");
		Basicinfo.setMobile(8967125367l);
		
		
		addInfo.setDoor_No("1/80");
		addInfo.setStreet("Avanti Nagar");
		addInfo.setLandmark("Community Hall");
		addInfo.setCity("Hyderabad");
		addInfo.setState("Telangana");
		addInfo.setCountry("India");

		
		System.out.println("Student_Id= "+stuData.getStudentId());
		System.out.println("First Name= "+Basicinfo.getFirtsName());
		System.out.println("Last Name= "+Basicinfo.getLastName());
		System.out.println("College= "+stuData.getCollegeName());
		System.out.println("Course= "+stuData.getCourse());
		System.out.println("Door_No= "+addInfo.getDoor_No());
		System.out.println("Street= "+addInfo.getStreet());
		System.out.println("City= "+addInfo.getCity());
		System.out.println("State= "+addInfo.getState());
		
		return stuData;
		
	}
}
