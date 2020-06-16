package com.naver.helloWorld;
import java.util.Random;
public class Practice2 {
	public static void main(String[] args) {
		double rand=Math.random();
		
		
		//10에서 9사이의 랜덤값을 출력
		
		int rVal=(int)(rand*10);
		//rand 값에 10을 곱하고 정수로 형변환을 한다.
		System.out.println(rVal);
		
		int rVal2=(int)(Math.random()*16);
		System.out.println(rVal2);
		
		int rVal3=(int)(Math.random()*15)+1;
		System.out.println(rVal3);
		
		//30~50까지
		int  rVal4=(int)((Math.random()*21)+30);
		System.out.println(rVal4);
	}
}
