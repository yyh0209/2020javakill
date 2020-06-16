package com.naver.helloWorld;

public class oper6 {
	public static void main(String[] args) {
		
		//String은 참조형변수라 텍스트가 같아도 주소값이 다르다
		String str1="안녕";
		String str2="안녕";//참조형변수비교
		String str3=str1;
		
		//변수가3개있는데 실제로는 2개
		System.out.println(str1==str3);
		//주소값이 달라서 false가 뜬다.
		System.out.println(str2.equals(str1));
		//문자열 비교 equals()
		System.out.println("안녕3".equals(str1)); //실제로 쓰는것
		System.out.println("안녕4".equals("안녕5"));
		System.out.println(str2.equals("안녕6"));
	}
	
}
