package com.javaex.ex07;

public class Circle extends Shape implements Drawable{

//--------------------------------------------------------------				필드
	private int radius;

//--------------------------------------------------------------				생성자
	public Circle() {

	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}

//--------------------------------------------------------------				setter, getter

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

//========================================				기본 메소드				
//--------------------------------------------------------------				draw()

	public void draw() {
		System.out.println(
				"[원] --> #배경색 : [ " + fillColor + " ],   #선색 : [ " + lineColor + " ],   #반지름 : [ " + radius + " ]");
	}
	
	public double area() {
		return radius*radius*3.14;
	}

//--------------------------------------------------------------				toString()

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}

}
