package com.javaex.ex05;

public class Triangle extends Shape {

//--------------------------------------------------------------				필드

	private int width;
	private int height;

//--------------------------------------------------------------				생성자

	public Triangle() {
	}

	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}

//--------------------------------------------------------------				setter, getter

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

//========================================				일반메소드
//--------------------------------------------------------------				draw()
	public void draw() {
		System.out.println("[삼각형] --> #배경색 : [ " + fillColor + " ],   #선색 : [ " + lineColor + " ],   #가로길이 : [ " + width
				+ " ],   #세로길이 : [ " + height + " ]");
	}

//--------------------------------------------------------------				toString()

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", fillColor=" + fillColor + ", lineColor="
				+ lineColor + "]";
	}

}
