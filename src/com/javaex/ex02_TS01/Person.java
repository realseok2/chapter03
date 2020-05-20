package com.javaex.ex02_TS01;

public class Person {

	protected String name;
	protected int age;

//--------------------------------------------------------------------		생성자

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

//--------------------------------------------------------------------		setter, getter

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

//--------------------------------------------------------------------		peShowInfo();

	public void peShowInfo() {
		System.out.println("Name - \t" + name + "\tAge - \t" + age);
	}

}
