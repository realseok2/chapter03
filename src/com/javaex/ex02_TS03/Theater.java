package com.javaex.ex02_TS03;

public class Theater extends Movie {

	private String roomtype;

	// ----------------------------------------------------------------------- 생성자

	public Theater() {

	}

	public Theater(String roomtype) {
		this.roomtype = roomtype;
	}

	public Theater(String title, int year, String roomtype) {
		super(title, year);
		this.roomtype = roomtype;
	}

	// -----------------------------------------------------------------------
	// setter, getter

	public String getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}

	// -----------------------------------------------------------------------
	// thShowInfo()

	public void th01ShowInfo() {
		System.out.println("선택하신 영화의 상영관은 [ " + roomtype + " ] 입니다. 즐거운 시간되십시오.");
	}

	// -----------------------------------------------------------------------
	// thShowInfo()

	public void th02ShowInfo() {
		System.out.println("선택하신 영화는 [ " + super.title + " ] 이고 해당 영화는 [ " + super.year + " ] 년도에 개봉하였습니다."
				+ "상영관은 [ " + roomtype + " ] 입니다. 즐거운 시간되십시오.");
	}

}
