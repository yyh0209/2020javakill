package com.naver.mission;
import java.util.Scanner;
public class mission5 {
	/*
	 * 점수를 입력해보세요(0~100)
	 * 
	 * 90점이상 A
	 * 80점이상 B
	 * 70점이상 C
	 * 나머지는 무조건 D(+,-없음)입니다
	 * 100점 초과면 "잘못입력하셨습니다"
	 * 1의자릿수가 7점이상이면+ if(>)
	 * 						else if(<)
	 * 1의자릿수가 3점이하면 -
	 * 
	 * 95= a,97=a+ 93=a-
	 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력해 주세요: (0~100)");
		int score = scan.nextInt();
		scan.close();
		
		if(score > 100 || score < 0) {
			System.out.println("잘 못 입력하였습니다.");
			
		} else if(score < 70) {
			System.out.print("D");
			
		} else if(score < 80) {
			System.out.print("C");
			
		} else if(score < 90) {
			System.out.print("B");
			
		} else {
			System.out.print("A");
		}

		if(score == 100) {
			System.out.print("+");
		} else if(score >= 70){
		} else if(score >= 70 && score <= 100){
			int mod = score % 10;

			if(mod >= 7) {
				System.out.print("+");	
			} else if(mod <= 3) {
				System.out.print("-");
			}
		}
		
	}
}
