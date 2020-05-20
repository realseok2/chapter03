package com.javaex.ex04;

public class ShapeApp {

	public static void main(String[] args) {

		// 원 관리
		Circle[] cArray = new Circle[3];

		Circle c01 = new Circle("빨강", "파랑", 1);
		Circle c02 = new Circle("검정", "분홍", 3);
		Circle c03 = new Circle("하양", "노랑", 5);

		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;

		for (int i = 0; i < cArray.length; i++) {
			cArray[i].draw();
		}

		System.out.println("---------------------------------------------------------------------------------------");

		// 삼각형 관리
		Triangle[] tArray = new Triangle[3];

		Triangle t01 = new Triangle("빨강", "파랑", 1, 2);
		Triangle t02 = new Triangle("검정", "분홍", 3, 4);
		Triangle t03 = new Triangle("하양", "노랑", 5, 6);

		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;

		for (int i = 0; i < tArray.length; i++) {
			tArray[i].draw();
		}

		System.out.println("---------------------------------------------------------------------------------------");

		// 사각형 관리
		Rectangle[] rArray = new Rectangle[3];

		Rectangle r01 = new Rectangle("빨강", "파랑", 1, 2);
		Rectangle r02 = new Rectangle("검정", "분홍", 3, 4);
		Rectangle r03 = new Rectangle("하양", "노랑", 5, 6);

		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;

		for (int i = 0; i < rArray.length; i++) {
			rArray[i].draw();
		}

		System.out.println("---------------------------------------------------------------------------------------");

	}

}
