package com.javaex.ex09;

import java.io.IOException;

public class MyFileApp {

	public static void main(String[] args) {
	
		MyFile mf = new MyFile();
//		mf.fileRead("c:\\myfile.txt");
		
//		mf.fileRead2("aaaa");
		
		try {
			mf.fileRead3("aaaa");	
		} catch (IOException e) {
			System.out.println("파일이 없습니다. ㅎㅎㅎ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
