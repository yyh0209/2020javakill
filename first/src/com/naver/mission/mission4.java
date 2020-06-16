package com.naver.mission;
import java.util.Scanner;
public class mission4 {
	/*
	 * switch 구문을 이용해
	 * 월을 입력해주세요:
	 * 
	 * 3~5를 입력했다면"봄입니다"
	 * 6~8을 입력했다면"여름입니다"
	 * 9~11을 입력했다면 "가을입니다"
	 * 1,2,12를 입력했다면 "겨울입니다"를 출력하시오
	 * 
	 * 1~12가 아닌 값을 입력했다면"잘목입력했습니다"를 출력하시오.
	 * */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		char[] season= {'봄','여름','가을','겨울'};
		System.out.print("월을 입력해주세요");
		String month=scan.nextLine();
		scan.close();
		
		switch(month) {
		case "3": case"4":case"5":
			
			System.out.print(season[0]+"입니다");
		break;
		case "6": case"7":case"8":	
			System.out.print(season[1]+"입니다");
		break;
		case "9":
			case "10":
			case "11":	
			System.out.print(season[2]+"입니다");
		break;
		case "12": case"1":case"2":	
			System.out.print(season[3]+"입니다");
		break;
		default:
			System.out.println("잘못입력하셨습니다.");
		}
	}
}
