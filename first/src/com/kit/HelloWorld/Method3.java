package com.kit.HelloWorld;

public class Method3 {
	public static void main(String[] args) {
		int result=sum(30,10); //=을 만나게 되면 메서드부터 실행되어 결과값을 복사한다.
		System.out.println(result);
		
		result=minus(30,20);
		System.out.print(result);
		
	}
	
	//비 보이드형 메서드는 return값은 int형인경우 정수를 넘겨받는다.
	public static int sum(int n1,int n2) {
		return n1+n2;
	}
	
	public static int minus(int n1,int n2) {
		return n1-n2;
	}
}
