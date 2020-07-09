package com.kita.first.level2;
import java.util.Scanner;
/*
 * 입력값을 받아서
 * 별찍기
 * */
public class Mission6_2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int iStar=0;
		System.out.println("별을 몇개 찍겠습니까?");
		int ScanStar=scan.nextInt();
		scan.close();
		for(iStar=0;iStar<=ScanStar;iStar++) {
			System.out.print("*");
		}
	}
}
