package com.javaex.ex02;

public class Person {

//--------------------------------------------------------------------------------------		필드

	protected String name;
	protected int age;

	
//--------------------------------------------------------------------------------------		생성자

	public Person() {}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

//--------------------------------------------------------------------------------------		setter, getter

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
//=======================================================	일반 메소드
//--------------------------------------------------------------------------------------		showInfo(), toString()

	public void showInfo() {
		System.out.println("#이름 = " + name + "\t#나이 = " + age + "세");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}