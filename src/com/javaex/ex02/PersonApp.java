package com.javaex.ex02;

public class PersonApp {

	public static void main(String[] args) {
		Person p1 = new Person("정우성", 58);
		p1.peShowInfo();

		Student s1 = new Student("깡고등학교");
		s1.stShowInfo();

		Student s2 = new Student("김태희", 36, "내려");
		System.out.println(s2.getName());
		s2.setName("태희김");
		System.out.println(s2.getName());
		
		s2.stShowInfo();

		Student s3 = new Student("정지훈", 39, "차에타브아라아아앙");
		s3.stShowInfo();

	}

}
