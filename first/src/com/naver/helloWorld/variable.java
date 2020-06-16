package com.naver.helloWorld;

public class variable {
	public static void main(String[] args) {
		//변수선언
		//정수형
		char szName;//16bit
		szName='a';
		System.out.println(szName);
		System.out.println('a');
		
		szName='b';
		System.out.println(szName);
		int nVar; //32bit
		byte v2; //8bit
		short v3; //16bit
		long v5;//64bit
		nVar=10;
		v2=127; //리터럴 128부터는 short 형
		v3=24;
		v5=40000;
		//v2=v3;은 담을수없다
		//v3=v2;는 할수있다.
		//타입은 같아야하며
		System.out.println(nVar);
		System.out.println(v2+v2);
		//오버플로우대신 인테그랄 프로모션이 발생한다.
		System.out.println(v3);
		System.out.println(v5);
		//실수형
		float v6;//32bit
		
		v6=3.14f;
		//v6=(float)10.1; 강제형변환
		
		double v7;//64bit 실수형의 기본
		//참조형
		v7=65.1;
		boolean v8;//1bit 1,0 true/false 
		
		String r1="안녕하세요";
		System.out.println(r1);
		
		/*
		 * 정수형:char,int,short,byte,long,boolean
		 * 실수형:float,double
		 * 변수를 선언했으면 정의를 해야한다.
		 * 참조형
		 * 
		 * */
	}
}
