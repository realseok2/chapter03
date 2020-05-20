package com.javaex.ex02_TS04;

public class Song {

	protected String artist;
	protected String title;

//--------------------------------------------------------------			생성자

	public Song() {

	}

	public Song(String artist, String title) {
		this.artist = artist;
		this.title = title;
	}

//--------------------------------------------------------------			setter, getter

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

//--------------------------------------------------------------			soShowInfo()

	public void soShowInfo() {
		System.out.println("현재 재생 중인 음악은 [ " + artist + " ] 의 곡으로 제목은 [ " + title + " ] 입니다.");
	}

}
