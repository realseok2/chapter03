package com.javaex.ex05_TS02;

public class ShapeApp {

	public static void main(String[] args) {

		Shape[] sArray = new Shape[9];
		
		Shape c01 = new Circle("가나", "다라", 10);
		Shape c02 = new Circle("마바", "사아", 20);
		Shape c03 = new Circle("자차", "카타", 30);
		
		Shape t01 = new Triangle("빨강", "아야", 1, 7);
		Shape t02 = new Triangle("주황", "어여", 2, 8);
		Shape t03 = new Triangle("노랑", "오요", 3, 9);
		
		Shape r01 = new Rectangle("초록", "우유", 4, 10);
		Shape r02 = new Rectangle("파랑", "으이", 5, 11);
		Shape r03 = new Rectangle("남색", "끝남", 6, 12);
		
		sArray[0] = c01;
		sArray[1] = c02;
		sArray[2] = c03;
		sArray[3] = t01;
		sArray[4] = t02;
		sArray[5] = t03;
		sArray[6] = r01;
		sArray[7] = r02;
		sArray[8] = r03;

		for(int i = 0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
