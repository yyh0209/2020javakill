package com.naver.helloWorld;

public class variable2 {
	public static void main(String[] args) {
		int num=10;
		int num2,num3=20;
		int num4=10,num5=15;
		
		//변수명 주의사항
		//1,소문자,대문자를 구별한다 aa,Aa,AA
		//2,특수기호는_,$만 사용할수있다.Ex)int _tagged;
		//카멜케이스사용 Ex)int myNewData;
		//특수기호로 시작해도무방
		//3,숫자로 시작하면 안됨 다만 뒤에 숫자붙이는건 가능함
		//4,예약어 사용금지
		//5,java에서 지정된 메소드를 변수로 사용할수없음.
		//상수화시키는방법
		final int _Num7=1_000_000;
		System.out.println(_Num7);
		//7,상수명은 무조건 대문자,구분은 _로 한다.
	}
}
