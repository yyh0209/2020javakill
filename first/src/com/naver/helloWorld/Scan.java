package com.naver.helloWorld;
import java.util.Scanner;
public class Scan {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); //new: 객체생성 똑같지만 주소가 달라진다.
		System.out.print("나이는?");
		int age=scan.nextInt();
		System.out.println("나이:"+age);
		
		System.out.print("이름은?");
		String name=scan.next();
		System.out.println("이름:"+name);
		scan.close();
	}
}
