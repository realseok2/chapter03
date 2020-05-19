package com.javaex.ex01;

public class PersonApp {

	public static void main(String[] args) {

		Person p1 = new Person("정우성", 58);
		p1.showInfo();
		
		Student p2 = new Student("정지훈", 38, "깡고등학교");
		p2.showInfo();

	}

}
