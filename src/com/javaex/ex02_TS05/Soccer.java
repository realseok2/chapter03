package com.javaex.ex02_TS05;

public class Soccer {

	protected String name;
	protected int age;

//-----------------------------------------------------------			생성자

	public Soccer() {

	}

	public Soccer(String name, int age) {
		this.name = name;
		this.age = age;
	}

//-----------------------------------------------------------			setter, getter

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

//-----------------------------------------------------------			showInfo()

	public void showInfo() {
		System.out.println("[ " + name + " ] 선수의 나이는 [ " + age + "세 ] 입니다.");
	}

}
