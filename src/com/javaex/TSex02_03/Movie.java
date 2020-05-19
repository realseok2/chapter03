package com.javaex.TSex02_03;

public class Movie {

	protected String title;
	protected int year;

//-----------------------------------------------------------------------			생성자

	public Movie() {

	}

	public Movie(String title, int year) {
		this.title = title;
		this.year = year;
	}

	// -----------------------------------------------------------------------
	// setter, getter

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// -----------------------------------------------------------------------
	// moShowInfo();

	public void moShowInfo() {
		System.out.println("선택하신 영화는 [ " + title + " ] 이고 해당 영화는 [ " + year + " ] 년도에 개봉하였습니다.");
	}

}
