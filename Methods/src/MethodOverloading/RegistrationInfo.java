package MethodOverloading;

import java.util.Date;


//------>  Class for StudentInfo  <----------

class studentInfo extends basicInfo{
	
	private String studentId;
	private String collegeName;
	private String course;
	private String Stream;
	private short duration;
	private Date dateOfJoining;
	
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getStream() {
		return Stream;
	}
	public void setStream(String stream) {
		Stream = stream;
	}
	public short getDuration() {
		return duration;
	}
	public void setDuration(short duration) {
		this.duration = duration;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
}


// --------> Class for BasicInfo <--------

class basicInfo extends addressInfo{
	private String firtsName;
	private String lastName;
	private String gender;
	private short age;
	private int mobile;
	private String emailId;
	public String getFirtsName() {
		return firtsName;
	}
	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public short getAge() {
		return age;
	}
	public void setAge(short age) {
		this.age = age;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}



//--------> Class for addressInfo <--------

class addressInfo{
	private String Door_No;
	private String street;
	private String landmark;
	private String city;
	private String state;
	private String country;
	public String getDoor_No() {
		return Door_No;
	}
	public void setDoor_No(String door_No) {
		Door_No = door_No;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}



//--------> Class for employeeInfo <--------

class employeeInfo extends basicInfo{
	
	
	private String employeeId;
	private String role;
	private double salary;
	private String companyName;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
}

public class RegistrationInfo extends studentInfo {

	public static void main(String[] args) {
		
		RegistrationInfo registrationInfo = new RegistrationInfo();
		registrationInfo.setStudentId("APR298390");
		System.out.println("Student_Id: "+registrationInfo.getStudentId());
		
	}


}
