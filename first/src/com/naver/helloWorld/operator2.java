package com.naver.helloWorld;

public class operator2 {
	public static void main(String[] args) {
		int num1=10;
		int num2=10;
		
		int nResult=num1++;//후위연산자
		System.out.println("nResult:"+nResult);

		System.out.println("num1:"+num1);
		
		int nResult2=++num2;//전위연산자
		System.out.println("nResult2:"+nResult2);
		System.out.println("num2:"+num2);

	}
}
