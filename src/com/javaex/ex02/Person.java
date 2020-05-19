package com.javaex.ex02;

public class Person {

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

//--------------------------------------------------------------------------------------		showInfo(), toString()

	public void peShowInfo() {
		System.out.println("#이름 = " + name + "\t#나이 = " + age + "세");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}