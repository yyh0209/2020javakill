package com.kit.HelloWorld;
/*
 * 메소드 구구단을 만들어보자!
 * 오버로딩똑같은 메소드명을 여러개 만들수 있는데 매개변수가 달라져야된다.()
 * */
public class MethodMission1 {
public static void main(String[] args) {
	multiply(2);
	multiply(2);
	
	multiply(5,6);
}

public static void multiply(int z) {

	for(int i=0;i<10;i++) {
			System.out.printf("%d X %d=%d\n",z,i,(i*z));
			
		}
	System.out.println();
	}

public static void multiply(int sDan,int eDan) {
	for(int i=sDan;eDan>=i;i++) {
		multiply(i);
	}
	System.out.println();
}
}
	
