package com.naver.mission;

public class MethodMission1 {
	public static void main(String[] args) {
		int result=abs(10);
		System.out.println(result);
		//절대값 10
		
		result=abs(-10);
		System.out.println(result);
		//음수였을때 양수로 바꿔야한다.
		
	}
	public static int abs(int n1) {
		
		return (n1<0) ? -n1:n1;//절대값을 반환
	}
}
