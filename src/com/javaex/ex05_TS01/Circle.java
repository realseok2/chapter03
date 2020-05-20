package com.javaex.ex05_TS01;

public class Circle extends Shape {

//-------------------------------------------------------------					필터
	private int radius;

//-------------------------------------------------------------					생성자

	public Circle() {

	}

	public Circle(int radius) {

	}

	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}

//-------------------------------------------------------------					setter, getter

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

//=======================================				일반 메소드
//-------------------------------------------------------------					draw()

	public void draw() {
		System.out.println(
				"[원] --> #배경색_[ " + fillColor + " ],   #테두리색_[ " + lineColor + " ],   #반지름_[ " + radius + " ]");
	}

//-------------------------------------------------------------					toString()

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getRadius()=" + getRadius() + "]";
	}

}
