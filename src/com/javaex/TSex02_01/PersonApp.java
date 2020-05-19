package com.javaex.TSex02_01;

public class PersonApp {

	public static void main(String[] args) {

		Person p = new Person("정지훈", 39);
		p.peShowInfo();

		Student s1 = new Student("차에타봐");
		s1.scShowInfo();

		Student s2 = new Student("김태희", 37, "깡...");
		s2.stShowInfo();

	}

}
