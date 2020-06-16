package com.naver.mission;
import java.util.Scanner;
public class mission2 {
//scanner로 정수를 입력받아 
	//그 값이 홀수면 홀수를 출력 
	//짝수면 짝수를 출력하라
	public static void main(String args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("값을 입력하시오.");
		int num1 = scan.nextInt();
		
		if(num1%2==0) {
			System.out.println("짝수");
		}
		else if(num1%2==1) {
			System.out.println("홀수");
		}
		else {
			System.out.println("잘못입력하셨습니다");
		}
	}
}
