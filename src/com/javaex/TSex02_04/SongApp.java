package com.javaex.TSex02_04;

public class SongApp {

	public static void main(String[] args) {

		Song so = new Song("Billie Eilish", "All the good girls go to hell");
		so.soShowInfo();

		Platform no1 = new Platform("YOUTUBE");
		no1.pf01ShowInfo();

		Platform no2 = new Platform("Lolo Zouai", "Blooklyn Love", "Genie");
		no2.pf02ShowInfo();

	}

}
