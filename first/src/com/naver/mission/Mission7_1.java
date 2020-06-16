package com.naver.mission;
/*
 * while문 조건식 사용하여 
 * 1~100을 모두 더한 값이 출력되도록 하세요
 * 
 * 합계=5050;
 * */
public class Mission7_1 {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while(i < 101) {
			sum += i;
			i++;
		}
		System.out.println("합계:"+sum);
	}
}
