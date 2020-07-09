package com.kit.HelloWorld;

public class Calc {
	static int n1;
	static int n2;
	//전역변수는 무조건 멤버필드다.
	public int sum() {
		return this.n1+this.n2;//static이 없으면 this로 클래스 변수를 호출해야 쓸수있다.
		//매개변수로 선언한 int형과 클래스 멤버변수의 위치는 서로 다르게 작용한다.
		//this는 무조건 주소값을 적용하기때문에 객체화를 해야된다.
	}
	public static int sum(int n1,int n2) {
		
		return n1+n2;//멤버함수로 멤버변수를 더하고 그 결과를 더하는 메소드를 만든다.
	}
	//전역변수 스코프의 시작과 끝은 클래스의 스코프를 기준으로 한다.

}
//모델을 만들어보자.