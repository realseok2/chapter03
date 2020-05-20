package com.javaex.ex02_TS01;

public class Student extends Person {

	private String schoolName;

//----------------------------------------------------------------			생성자

	public Student() {

	}

	public Student(String schoolName) {
		this.schoolName = schoolName;
	}

	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
	}

//----------------------------------------------------------------			setter, getter

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
//----------------------------------------------------------------			scShowInfo()

	public void scShowInfo() {
		System.out.println("schoolName - \t" + schoolName);
	}

//----------------------------------------------------------------			stShowInfo()

	public void stShowInfo() {
		System.out.println("Name - \t" + super.name + "\tAge - \t" + super.age + "\tschoolName - \t" + schoolName);
	}

}
