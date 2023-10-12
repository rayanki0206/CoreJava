package MethodOverloading;


class StudentDetails1 {
	
	private String studentId;
	private String collegeName;
	private String course;
	private String Stream;
	private short duration;
	private String dateOfJoining;
	private BasicInfo1 basicInfo1;
	private AddressInfo1 addressInfo1;
	
	// Getters and setters
	
	
	
	public String getStudentId() {
		return studentId;
	}
	public BasicInfo1 getBasicInfo1() {
		return basicInfo1;
	}
	public void setBasicInfo1(BasicInfo1 basicInfo1) {
		this.basicInfo1 = basicInfo1;
	}
	public AddressInfo1 getAddressInfo1() {
		return addressInfo1;
	}
	public void setAddressInfo1(AddressInfo1 addressInfo1) {
		this.addressInfo1 = addressInfo1;
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
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
}
