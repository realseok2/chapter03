package com.javaex.ex03;

public class ShapeApp {

	public static void main(String[] args) {

		Rectangle[] rArray = new Rectangle[3];

		Rectangle r01 = new Rectangle("Red", "Gray", 4, 4);
		Rectangle r02 = new Rectangle("Blue", "Black", 17, 19);
		Rectangle r03 = new Rectangle("Red", "Yello", 10, 5);

		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;

		for (int i = 0; i < rArray.length; i++) {
			rArray[i].draw();
		}

		System.out.println("-------------------------------------------------------------------------------");

		Circle[] cArray = new Circle[3];

		Circle c01 = new Circle("Black", "White", 3);
		Circle c02 = new Circle("Red", "Pink", 7);
		Circle c03 = new Circle("Blue", "Violet", 5);

		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;

		for (int i = 0; i < cArray.length; i++) {
			cArray[i].draw();
		}

		System.out.println("-------------------------------------------------------------------------------");
		
		Triangle[] tArray = new Triangle[3];
		
		Triangle t01 = new Triangle("Black", "White", 3, 5);
		Triangle t02 = new Triangle("Black", "White", 3, 5);
		Triangle t03 = new Triangle("Black", "White", 3, 5);
		
	}

}
