package com.javaex.ex05_TS02;

public class Rectangle extends Shape {

//----------------------------------------------------------------------			필드

	private int width;
	private int height;

//----------------------------------------------------------------------			생성자

	public Rectangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}

//----------------------------------------------------------------------			setter, getter

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// ---------------------------------------------------------------------- draw()

	public void draw() {
		System.out.println(
				"[사각형] --> #배경색_" + fillColor + ",   #테두리색_" + lineColor + ",   #가로_" + width + ",   #세로_" + height);
	}

}
