package com.kita.first.level2;

public class NamedLoop {
	public static void main(String[] args) {
		
		//별명붙이기
		Parent1:
		for(int i=0;i<5;i++) {			
			for(int j=0;j<20;j++) {
				if(j==15) {
					break Parent1;//별명안에 있는 이중반복문 자체를 빠져나가기 위한 방법
				}
				System.out.printf("%d - %d\n",i,j);
			}
		}
	}
}
