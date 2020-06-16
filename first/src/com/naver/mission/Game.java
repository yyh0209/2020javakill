package com.naver.mission;
import java.util.Scanner;
import java.util.Random;
public class Game {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double dRange=Math.random();//실수범위
		int imin=10;
		int imax=80;
		int iRange=(int)(dRange*(imax-imin+1)+imin);
		
		System.out.printf("렌던값 %d에서 %d를 맞추는 게임\n",imin,imax);
		//범위를 정수값으로 형변환후 출력
		while(true) {
			System.out.println("값 입력:");
			int iCount=scan.nextInt();//숫자 입력
			
			if(iCount<imin||iCount>imax) {
				System.out.print("잘못입력하셨습니다");
			}
			if(iRange>iCount) {
			System.out.println("UP");//입력한 숫자가 iRange보다 작으면 up을 출력
			}
			
			else if(iRange<iCount) {
				System.out.println("Down");
				//입력한 숫자가 iRange보다 작으면 down을 출력
			}
			else if(iRange==iCount) {
			System.out.println("Great!!");
			break;
			
			}
			scan.close();
		}
		}
	}
