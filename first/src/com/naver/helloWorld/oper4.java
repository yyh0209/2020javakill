package com.naver.helloWorld;

public class oper4 {
	public static void main(String[] args) {
		int num1=10;
		int num2=11;
		System.out.println("몫:"+num1/num2);
		System.out.println("몫:"+num1%num2);
		
		//비교연산자==는 boolean형
		boolean bResult=(num1==num2);
		System.out.println(bResult);
		System.out.println(num1=num2);
		System.out.println(num1);
		bResult=(num1!=num2);
		System.out.println(num1!=num2);
		
		System.out.println();
		bResult=num1>num2;
		System.out.println("num1>num2:"+bResult);
		bResult=num1>=num2;
		System.out.println("num1>=num2:"+bResult);
		bResult=num1<=num2;
		System.out.println("num1<=num2:"+bResult);
		
		//문자열비교는 할수가 없다.
	}
}
