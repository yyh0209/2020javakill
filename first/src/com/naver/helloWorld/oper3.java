package com.naver.helloWorld;

public class oper3 {
	public static void main(String[] args) {
		int num1=10;
		int cost=4;
		num1=num1+cost;
		System.out.println("num1:"+num1);
		
		int num2=10;
		num2=num1+2;
		System.out.println("num2:"+num2);
		
		int num3=10;
		num3+=(-2); //가독성을 띄기위해선 +=-보다는 (-n)를 적는게 낫다.
		System.out.println("num3:"+num3);
	}
}
