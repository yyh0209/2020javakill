package com.kita.first.level2;
import java.util.Scanner;
public class For3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);	
		int iStar=0;
		System.out.println("별을 몇층을 쌓겠습니까?");
		int iRepeat=scan.nextInt();
		scan.close();
		for(iStar=0;iStar<iRepeat;iStar++) {
			for(int starFloor=0;starFloor<iRepeat;starFloor++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
