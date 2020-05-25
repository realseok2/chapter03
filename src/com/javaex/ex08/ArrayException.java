package com.javaex.ex08;

public class ArrayException {

	public static void main(String[] args) {

		int intArray[] = new int[3];
		
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		
		try {
			System.out.println(intArray[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 초과하였습니다.");
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(intArray[3]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
