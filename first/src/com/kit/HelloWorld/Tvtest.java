package com.kit.HelloWorld;

public class Tvtest {
	
	public static void main(String[] args) {
	Tv tv1=new Tv();//new는 Tv를 객체화 하여 복사한다. 기본생성자

	System.out.println("name: "+tv1.name);

	System.out.println("power: "+tv1.power);

	System.out.println("channel: "+tv1.channel);
	System.out.println("====================");
	
	tv1.name="삼성tv";
	System.out.println("name: "+tv1.name);
	tv1.changerPower();
	System.out.println("power: "+tv1.power);
	tv1.changerPower();
	System.out.println("power: "+tv1.power);
	tv1.changerPower();
	System.out.println("power: "+tv1.power);
	tv1.channelUP();	
	//void형은 앞에=을 붙이면 안된다 비void형은 붙여야된다.
	//주소값이 리턴된다
	//tv객체의 주솟값만 저장하는 객체를 저장하겠다.tv객체 주솟값만 저장할수있다.
	}
}
