package com.javaex.ex07;

public class ShapeApp {

	public static void main(String[] args) {

		Drawable[] dArray = new Drawable[12];

		Drawable c01 = new Circle("빨강", "파랑", 1);
		Drawable c02 = new Circle("검정", "분홍", 3);
		Drawable c03 = new Circle("하양", "노랑", 5);

		Drawable t01 = new Triangle("빨강", "파랑", 1, 2);
		Drawable t02 = new Triangle("검정", "분홍", 3, 4);
		Drawable t03 = new Triangle("하양", "노랑", 5, 6);

		Drawable r01 = new Rectangle("빨강", "파랑", 1, 2);
		Drawable r02 = new Rectangle("검정", "분홍", 3, 4);
		Drawable r03 = new Rectangle("하양", "노랑", 5, 6);

		Drawable p01 = new Point(3, 3);
		Drawable p02 = new Point(4, 4);
		Drawable p03 = new Point(5, 5);

		dArray[0] = c01;
		dArray[1] = c02;
		dArray[2] = c03;
		dArray[3] = t01;
		dArray[4] = t02;
		dArray[5] = t03;
		dArray[6] = r01;
		dArray[7] = r02;
		dArray[8] = r03;
		dArray[9] = p01;
		dArray[10] = p02;
		dArray[11] = p03;

		// 전체 그리기
		for (int i = 0; i < dArray.length; i++) {
			dArray[i].draw();
		}
		System.out.println("======================================================");

		// Shape(도형) 의 면적 출력하기
		for (int i = 0; i < dArray.length; i++) {
			printArea(dArray[i]);
		}
	}

	public static void printArea(Drawable d) {
		if (d instanceof Shape) {
			System.out.println(((Shape) d).area());
		} else {
			System.out.println("점은 면적이 없습니다.");
		}

	}

}
