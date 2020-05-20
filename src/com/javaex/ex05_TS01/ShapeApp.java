package com.javaex.ex05_TS01;

public class ShapeApp {

	public static void main(String[] args) {

		Shape[] sArray = new Shape[9];

		Shape c01 = new Circle("빨강", "주황", 1);
		Shape c02 = new Circle("노랑", "초록", 2);
		Shape c03 = new Circle("파랑", "남색", 3);

		Shape t01 = new Triangle("빨강", "주황", 1, 2);
		Shape t02 = new Triangle("노랑", "초록", 3, 4);
		Shape t03 = new Triangle("파랑", "남색", 5, 6);

		Shape r01 = new Rectangle("빨강", "주황", 1, 2);
		Shape r02 = new Rectangle("노랑", "초록", 3, 4);
		Shape r03 = new Rectangle("파랑", "남색", 5, 6);

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

	}

}
