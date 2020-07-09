package com.kita.first.level2;

public class Break_continue {
	public static void main(String[] args) {
		
		
		//break
		/*for(int j=0;j<10;j++) {
		for(int i=0;i<3;i++) {
			for(int e=0;e<3;e++) {
			if(j==3) {break;}//for 문을 종료시키지않으면서 스코프를 벗어난다. 반복문을 특정 조건에 종료시키고 싶을때
			System.out.printf("%d -%d - %d\n",j,i,e);
					}
				}
			}
			//네임드 루프
			*/
			//continue
		for(int j=0;j<10;j++) {
		for(int i=0;i<3;i++) {
			for(int e=0;e<3;e++) {
			if(j==3) {continue;}// 특정구간을 스킵하고 계속 실행시키고 싶을때
			System.out.printf("%d -%d - %d\n",j,i,e);
					}
				}
			}
		}
}
