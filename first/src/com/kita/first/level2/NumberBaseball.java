package com.kita.first.level2;
import java.util.Scanner;
import java.util.Random;
/*
 * 숫자 야구게임이란?
 * 랜덤한 중복되지않은(무작위로 출력되야함.) 숫자3개를 맞춰
 * 1~9의 숫자중
 * 4,8,2가 나왔을때 
 * 
 * 1,2,3>S:0 자리도 맞추고 숫자도 맞출때 /B:1 자리는 맞췄는데 숫자를 틀렸을때 /O:2 자리와 숫자를 틀렸을떼
 * 4,5,6>
 * 종료!
 * */
public class NumberBaseball {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double rand=Math.random();//난수생성
		final int Len=3; //3회
		
		System.out.printf("숫자 %d 야구게임 시작!\n",Len);
		int cnt=0;//맞춘 횟수
		int iCount=(int)(rand*3);//컴퓨터가 던진 공의 임의수
		int[] rArr=new int[Len];//컴퓨터가 던진볼
		int[] myArr=new int[Len];//내가 던지는 볼
		int iStrike;//스트라이크횟수 System.out.println("S :"+iStrike);
		int iBall=0;//볼 횟수 System.out.println("B :"+iBall);
		int iOut=0;//아웃 횟수 System.out.println("B :"+iOut);
		while(true) {
			iStrike=0;
			iBall=0;
			System.out.println("1~9까지 투수가 던진 숫자를 입력하세요!");
		for(int i=0;i<myArr.length;i++ ) {
			myArr[i]=scan.nextInt();
			//한 경기당3회 반복,스트라이크,볼,아웃만있음 
		}
		for(int j=0;j<rArr.length;j++) {
				
				int BBaDDa=scan.nextInt();//내가 맞칠 숫자
						if(BBaDDa>=rArr[j]||BBaDDa<=rArr[j]) {
					System.out.println("Strike!!"+iStrike+"회");
						break;
					}else if(BBaDDa>rArr[j]||BBaDDa<rArr[j]){
						System.out.println("Ball!"+iBall+"회");
						break;
					}else {
					System.out.println("Out!!"+iOut+"회");
					break;
					}
				}
			}
		}

	}
