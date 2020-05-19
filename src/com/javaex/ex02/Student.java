package com.javaex.ex02;

public class Student extends Person {

	private String schoolName;

//=========================================			생성자
	public Student() {
	}

	public Student(String schoolName) {
		this.schoolName = schoolName;
	}

	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
	}

//=========================================			setter, getter

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

//=========================================			showInfo()

	public void stShowInfo() {
		System.out.println("이름 : \t" + super.name + "\t나이 : \t" + super.age + "\t학교 : \t" + schoolName);
	}

	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}

}
