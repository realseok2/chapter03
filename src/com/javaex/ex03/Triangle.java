package com.javaex.ex03;

public class Triangle {

//-------------------------------------------------------------				필드	
	private String fillColor;
	private String lineColor;
	private int width;
	private int height;

//-------------------------------------------------------------				생성자

	public Triangle() {
	}

	public Triangle(String fillColor, String lineColor, int width, int height) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		this.width = width;
		this.height = height;
	}

//-------------------------------------------------------------				setter, getter

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

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

//-------------------------------------------------------------				draw()

	public void draw() {
		System.out.println("[삼각형] --> #배경색 : [ " + fillColor + " ],   #선색 : [ " + lineColor + " ],   가로길이 : [ " + width
				+ " ],   세로길이 : [ " + height + " ]");
	}

//-------------------------------------------------------------				toString()

	@Override
	public String toString() {
		return "Triangle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", width=" + width + ", height="
				+ height + "]";
	}

}
