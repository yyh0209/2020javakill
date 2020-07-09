package com.kit.HelloWorld;

public class MonitorTest2 {
	public static void main(String[] args) {
		Monitor.brand="삼성";
		Monitor.printBrand();
		
		Monitor m1=new Monitor();
		m1.printInfo(); //static으로 지정된 함ㄷ수는 객체를 생성하고난수에 사용해야된다.
		//객체마다 다른값이 저장된 놈들은 static을 붙여선 안된다.
		//언제 메소드에 static을 붙일지 구분을 해야된다
		int result=Integer.parseInt("11");
		//모니터에 
	}
}
