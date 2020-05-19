package com.javaex.TSex02_05;

public class Position extends Soccer {

	private String Position;

//-----------------------------------------------------------			생성자	

	public Position() {
	}

	public Position(String position) {
		this.Position = position;
	}

	public Position(String name, int age, String position) {
		super(name, age);
		this.Position = position;
	}

//-----------------------------------------------------------			setter, getter

	public String getPosition() {
		return Position;
	}

	public void setPosition(String position) {
		Position = position;
	}

//-----------------------------------------------------------			po01ShowInfo();

	public void po01ShowInfo() {
		System.out.println("해당 선수의 포지션은 [ " + Position + " ] 입니다.");
	}

//-----------------------------------------------------------			po01showInfo();

	public void po02ShowInfo() {
		System.out.println(
				"[ " + super.name + " ] 선수의 나이는 [ " + super.age + "세 ] 이고, 포지션은 [ " + Position + " ] 입니다.");
	}

}
