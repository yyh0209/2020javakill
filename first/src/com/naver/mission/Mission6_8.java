package com.naver.mission;
import java.util.Scanner;

/*
 * 숫자를 입력:(종료:0)5
 * 숫자를 입력:(종료:0)7
 * 숫자를 입력:(종료:0)1
 * 숫자를 입력:(종료:0)0
 * 합계:13
 * 
 * 0을 누르면 while문을 빠져나가 입력값의 합계를 구한다.
 * */
public class Mission6_8 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int sum=0;
		
		while(true) {
			System.out.println("숫자를 입력하시오(종료:0)");
			int num=scan.nextInt();
			if(num==0) {
				break;
			}
			sum+=num;
		}
		scan.close();
		System.out.println("합계"+sum);
		
	}
}