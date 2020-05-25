package com.javaex.ex08;

import java.util.Scanner;

public class ArithException {

	public static void main(String[] args) {

		double result;
		int num;

		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		result = 100 / num; // 문제 발생 가능성 있는 곳

		try {
			result = 100 / num;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.toString());
		} finally {
			System.out.println("Finally 영역");
		}

		sc.close();

	}

}
