package com.kit.HelloWorld;

public class Arrpractice {
	public static void main(String[] args) {
		/*
		 * arr 1~100값이 들어가도록 해주세요 순서대로
		 * [0]=1
		 * [1]=2
		 * ..
		 * ..
		 * .[99]=100
		 * 
		 * 각 방에 있는 모든값을 더한후 결과값 출력
		 * */
		int[] iArr=new int[100];
		
		for(int i=0;i<iArr.length;i++) {
			iArr[i]=(i+1)*2;
			System.out.printf("[%d]:%d\n",i,iArr[i]);
		}
		for(int j=0;j<iArr.length;j++) {
			System.out.println("j : "+iArr[j]);
		}
		
		int sum=0;
		for(int k=0;k<iArr.length;k++) {
			sum+=iArr[k];
		}
		System.out.println("sum:	"+sum);
		
		String[] comma=new String[100];
		
		
		for(int n=0;n<iArr.length;n++) {
			if(n>0) {
				comma[n]=" , ";
				System.out.print(comma[n]);
			}
			
			System.out.print(iArr[n]);
		}
	}
}
