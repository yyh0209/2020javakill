package com.kit.HelloWorld;

public class Method {
	
	public static void main(String[] args) {
		
	//Static으로 설정을 하지않으면 
	sum(20,5);	
		//메소드의 장점
		//소스를 굉장히 효율적으로 할수있다.
		//중복된 소스를 안 넣어도 된다
	}
	
	public static void sum(int n1,int n2) {
		
		System.out.println(n1+n2);
		minus(n1,n2); 
	}
	public static int minus(int n1,int n2)//매개변수명은 자유다.
	{
		System.out.println(n1-n2);
		
		return n1+n2; //void를 적었을때는 안적어도 되는데 메소드 반환형이 정수타입일 경우
		//return은 반드시 적어야 반환이 된다.
	}
}
