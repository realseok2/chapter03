package com.javaex.ex08;

public class NullPointException {

	public static void main(String[] args) {

		String str = new String("하이?");
		str = null;

		try {
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("참조값이 없습니다.");
		}

	}

}
