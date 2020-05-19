package com.javaex.ex01;

public class Student {

	private String name;
	private int age;
	private String schoolName;

//-----------------------------------------------------------------------		생성자	

	public Student(String name, int age, String schoolName) {
		super();
		this.name = name;
		this.age = age;
		this.schoolName = schoolName;
	}

//-----------------------------------------------------------------------		setter, getter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

// -----------------------------------------------------------------------		showInfo(), toString()

	public void showInfo() {
		System.out.println("#이름 = \t" + name + "\t#나이 = \t" + age + "세\t#학교 = \t" + schoolName);
	}

}
