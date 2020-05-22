package com.javaex.ex07;

public class Point implements Drawable {

//-----------------------------------------------						필드

	private int x;
	private int y;

//-----------------------------------------------						생성자

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

// -----------------------------------------------					 setter, getter

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

// ----------------------------------------------- draw()

	public void draw() {
		System.out.println("[점] --> #x_[ " + x + " ],   #y_[ " + y + " ]");
	}

// ----------------------------------------------- toString()

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
