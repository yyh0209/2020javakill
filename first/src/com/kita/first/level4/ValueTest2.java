package com.kita.first.level4;

public class ValueTest2 {
	public static void main(String[] args) {
		String str=new String("안녕");
		System.out.println("str:"+str);
		//println()은 오버로딩이 되어있는 상태다.
		System.out.println();
		
		Value val=new Value(2);
		System.out.println("val:"+val);
		String strVal=String.valueOf(val); //String int를 String으로 변환
		//String.format("%d", val); 이 메소드가 유연하다.
		String strVal2=strVal.toString();
		
		
		
		//toString에다 2를 찍어라.
		//
		//패키지명이 출력
	}
}
