package com.javaex.TSex02_03;

public class MovieApp {

	public static void main(String[] args) {

		Movie m = new Movie("기생충", 2019);
		m.moShowInfo();

		Theater no1 = new Theater("3D 상영관");
		no1.th01ShowInfo();

		Theater no2 = new Theater("바닐라스카이", 2002, "2D 상영관");
		no2.th02ShowInfo();

	}

}
