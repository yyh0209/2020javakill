package com.kita.first.level2;
/*1.사이다(500원)
 * 2.콜라(600)
 * 3.환타(700)
 * 4.마운틴듀(800)
 * 5.초코우유(400)
 * 6.바나나우유(400)
 * 
 * 메뉴를 선택하세요:(종료:0) 1
 * 사이다 500원
 *  메뉴를 선택하세요:(종료:0) 5
 * 초코우유 400원
 *  메뉴를 선택하세요:(종료:0) 7 continue;
 * 잘못 입력!!
 *  메뉴를 선택하세요:(종료:0) 0 //break;
 * 종료!
 * 
 */

import java.util.Scanner;

public class GreatMission2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//입력값을 받는다.
		int[] iPrice= {500,600,700,800,400,400};//음료수의 가격

		int iSelect=0;//내가누를 숫자

		String[] strlavel={"사이다","콜라","환타","마운틴듀","초코우유","바나나우유"};//절대로 텍스트로 입력받지않는다.
		int iTotal=0;
		for(int i=0;i<6;i++) {
			System.out.printf("%d. %s (%d원)\n",i+1,strlavel[i],iPrice[i]);
			}
		//자판기.
		while(true) {
			System.out.print("메뉴를 선택하세요: (종료:0)");
			iSelect=sc.nextInt();
			
			//입력값이 틀렸을때 (6을 넘어갈때,정수가 아닌 특수문자,혹은 문자,문자열을 입력했을떄)  예외처리
			if(iSelect>6) {
				System.out.println("잘못 입력하셨습니다"); //6을 넘어간 숫자를 입력했을때
				continue;
			}else if(iSelect==0) {
				break; //0을 눌러 while문을 빠져나가고싶을떼 
			}else {
				System.out.printf("%s %d원",strlavel[iSelect-1],iPrice[iSelect-1]);
				iTotal+=iPrice[iSelect-1];
				//strlavel의 배열과 iPrice의 배열을 출력하고
				//iTotal에 iPrice의 선텍한 가격의 더한값을 대입한다.
			}
			
			
		}
		
		System.out.println("종료!!");//결과에 만족했을때 종료합니다.
		System.out.println(iTotal+"원 사용했습니다");
		sc.close();
	}
}
