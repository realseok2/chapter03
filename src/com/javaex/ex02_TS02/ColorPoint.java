package com.javaex.ex02_TS02;

public class ColorPoint extends Point{

	private String color;
	
//---------------------------------------------------------------------			생성자

	public ColorPoint() {
		
	}
	
	public ColorPoint(String color) {
		this.color=color;
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}


	
	
//---------------------------------------------------------------------			setter, getter
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
//---------------------------------------------------------------------			cp1ShowInfo()
	
	public void cp1ShowInfo() {
		System.out.println("[ 좌표의 색상 = " + color + " ]");
	}
	
//---------------------------------------------------------------------			cp2ShowInfo()

	public void cp2ShowInfo() {
		System.out.println("[ x 값의 좌표 = " + super.x + ",\t y 값의 좌표 = " + super.y + ",\t좌표의 색상 = " + color + " ]");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
