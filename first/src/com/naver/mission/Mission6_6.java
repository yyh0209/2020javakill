package com.naver.mission;
import java.util.Scanner;
public class Mission6_6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int iStar=0;//별의 갯수
		int iFloor=0;//별의 층수
		
		System.out.println("삼각형을 몇층끼지 샇겠습니까?");
		int iRepeat=scan.nextInt();//별의 입력반복횟수
		scan.close();
		for(iStar=0;iStar<iRepeat;iStar+=1) {
			for(iFloor=0;iFloor<=iStar;iFloor++) {
				System.out.print("*");
			}
			System.out.println();
		}
	} 
}
