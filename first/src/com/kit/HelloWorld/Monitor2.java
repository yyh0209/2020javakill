package com.kit.HelloWorld;

public class Monitor2 {
	String brand;//static 변수:
	int inch; //인스턴스 변수
	static int cnt;
	
	public Monitor2(String brand,int inch) {
		super();//생성자 호출
		cnt++;
		this.brand=brand;
		this.inch=inch;
		
	}
	void printInfo() {
		System.out.printf("brand: %s, inch: %d\n", 
				this.brand,this.inch);
	}
}
