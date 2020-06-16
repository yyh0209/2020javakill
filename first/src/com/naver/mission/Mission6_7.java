package com.naver.mission;
import java.util.Scanner;
public class Mission6_7 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		int iStar=0;
		int ivoid=0;
		int iFloor=0;
		System.out.println("출력할 별의 갯수를 구하시오");
		int iRepeat=scan.nextInt();
		scan.close();
		for(iStar=0;iStar<iRepeat;iStar++) {

			for(ivoid=iStar;ivoid<iRepeat-1;ivoid++) {
				System.out.print(" ");
			}
			for(iFloor=0;iFloor<=iStar;iFloor++) {		
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
