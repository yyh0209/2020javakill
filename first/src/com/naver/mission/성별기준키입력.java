package com.naver.mission;

import java.util.Scanner;

public class 성별기준키입력 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("성별을 입력해주세요(남/여)");
		String gender=scan.nextLine();
		
		if("남".equals(gender)||"여".equals(gender)) {
			System.out.print("키를 입력해주세요");
			int height=scan.nextInt();
			int standHeight=0;
			if("남".equals(gender)) {
				standHeight=160;
			}else {
				standHeight=150;
		}
		if(height>standHeight) {
			System.out.println("평균초과입니다");
		}else if(height<standHeight) {
			System.out.println("평균미만입니다");
		}else {
			System.out.println("평균입니다");
		}
	}else{
		System.out.println("성별을 잘못입력하셨습니다.");
		}
}
}
