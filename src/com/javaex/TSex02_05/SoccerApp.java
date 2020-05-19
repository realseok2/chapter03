package com.javaex.TSex02_05;

public class SoccerApp {

	public static void main(String[] args) {

		Soccer sc = new Soccer("손흥민", 26);
		sc.showInfo();

		Position no1 = new Position("LW");
		no1.po01ShowInfo();

		Position no2 = new Position("외질", 31, "AM");
		no2.po02ShowInfo();

	}

}
