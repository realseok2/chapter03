package com.javaex.ex05_TS02;

public class Circle extends Shape {

//----------------------------------------------------------------------			필드
	private int radius;

//----------------------------------------------------------------------			생성자

	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}

//----------------------------------------------------------------------		 	setter, getter

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

//----------------------------------------------------------------------			draw()

	public void draw() {
		System.out.println("[원] --> #배경색_" + fillColor + ",   #테두리색_" + lineColor + ",   #반지름_" + radius);
	}

}
