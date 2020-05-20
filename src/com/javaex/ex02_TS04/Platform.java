package com.javaex.ex02_TS04;

public class Platform extends Song {

	private String platform;

//--------------------------------------------------------------			생성자

	public Platform() {

	}

	public Platform(String platform) {
		this.platform = platform;
	}

	public Platform(String artist, String title, String platform) {
		super(artist, title);
		this.platform = platform;
	}

//--------------------------------------------------------------			setter, getter

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

//--------------------------------------------------------------			pf01ShowInfo()

	public void pf01ShowInfo() {
		System.out.println("현재 사용 중인 Music Player는 [ " + platform + " ] 입니다.");
	}

//--------------------------------------------------------------			pf02ShowInfo()

	public void pf02ShowInfo() {
		System.out.println("현재 재생 중인 음악은 [ " + super.artist + " ] 의 곡으로 제목은 [ " + super.title + " ] 입니다."
				+ " 사용 중인 Music Player는 [ " + platform + " ] 입니다.");
	}

}
