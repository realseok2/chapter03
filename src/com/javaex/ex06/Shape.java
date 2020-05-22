package com.javaex.ex06;

public abstract class Shape {

//-------------------------------------------------------------------				필드
	protected String fillColor;
	protected String lineColor;

//-------------------------------------------------------------------				생성자
	public Shape() {
	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

//-------------------------------------------------------------------				setter, getter

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
//-------------------------------------------------------------------				draw()
	public abstract void draw();
	
	public abstract double area();
//-------------------------------------------------------------------				toString()

	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}

}
