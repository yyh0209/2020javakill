package com.kit.HelloWorld;

public class CalcTest {
	public static void main(String[] args) {
		
		//static을 붙은 경우
		//멤버변수정의만 해도된다.
		int result=Calc.sum(10,20);
		System.out.println(result);//30
		
		//static이 붙지 않은경우
		//객체를 생성하고
		//클래스내 멤버변수를 선언과 정의를 동시에해야된다
		Calc calc1=new Calc();
		calc1.n1=20;
		calc1.n2=30;
		System.out.println(calc1.sum());//50;
		//비 void형을 호출했다.
	}
}
