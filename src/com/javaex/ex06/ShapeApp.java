package com.javaex.ex06;

public class ShapeApp {

	public static void main(String[] args) {

		Shape[] sArray = new Shape[9];

		Shape c01 = new Circle("빨강", "파랑", 1);
		Shape c02 = new Circle("검정", "분홍", 3);
		Shape c03 = new Circle("하양", "노랑", 5);

		Shape t01 = new Triangle("빨강", "파랑", 1, 2);
		Shape t02 = new Triangle("검정", "분홍", 3, 4);
		Shape t03 = new Triangle("하양", "노랑", 5, 6);

		Shape r01 = new Rectangle("빨강", "파랑", 1, 2);
		Shape r02 = new Rectangle("검정", "분홍", 3, 4);
		Shape r03 = new Rectangle("하양", "노랑", 5, 6);

		sArray[0] = c01;
		sArray[1] = c02;
		sArray[2] = c03;
		sArray[3] = t01;
		sArray[4] = t02;
		sArray[5] = t03;
		sArray[6] = r01;
		sArray[7] = r02;
		sArray[8] = r03;

		for (int i = 0; i < sArray.length; i++) {
			sArray[i].draw();

		}
		System.out.println("======그리기출력=======");
		for(int i = 0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		

		System.out.println("======넓이출력=======");
		for(int i = 0; i<sArray.length; i++) {
//			System.out.println(sArray[i].area());
			printArea(sArray[i]);
		}
		
	}

	public static void printArea(Shape s) {
		System.out.println("면적은 : " + s.area() + "입니다.");
	}
}
