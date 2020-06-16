package com.naver.helloWorld;

public class Condition {
	public static void main(String[] args) {
		int num=3;
		
		String result=(num%2==1 ? "홀수":"짝수");
		
		System.out.printf("%d is odd? %b\n",num,result);
	} 
}
