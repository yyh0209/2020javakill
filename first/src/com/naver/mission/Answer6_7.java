package com.naver.mission;
import java.util.Scanner;
public class Answer6_7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

	int iStar=5;
	int iSpace=0;
	int iRepeat=scan.nextInt();
	
	System.out.println("반복할 공백을 쓰시오");
	for(iStar i=1;iStar<=star;i++) {
		for(iSpace=star;z>0;z--) {
			System.out.print(i<z?" ":"*");
		}
		System.out.println();
	}
	}
}
