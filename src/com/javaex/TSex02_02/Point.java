package com.javaex.TSex02_02;

public class Point {

	private int x;
	private int y;

//---------------------------------------------------------------------			생성자

	public Point() {

	}

	public Point(int x, int y) {

		this.x = x;
		this.y = y;
	}

//---------------------------------------------------------------------			setter, getter

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

//---------------------------------------------------------------------			pShowInfo()

	public void pShowInfo() {
		System.out.println("[ x 값의 좌표 = " + x + ",\t y 값의 좌표 = " + y + " ]");
	}

}
