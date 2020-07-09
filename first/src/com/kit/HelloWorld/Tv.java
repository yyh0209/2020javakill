package com.kit.HelloWorld;

public class Tv {
	//객체지향 프로그래밍
	//전역변수를 사용하게된다.
	//전역변수는 값을 저장하는 용도
	//객체는 전역변수와 메소드로 이루어져있다.
	//메소드는 일을하는용도
	//클래스를 만드는 용도는 틀을 만드는것이다.
	//클래스를 여러개를 만들수도있다, 상속도 받을수있다.
	//new라는 키워드는 객체를 생성할때 쓰는 용도.
	//생성된 객체는 전부 다른 주소값을 받고있다->별개의 객체를 가지고있다
	//자기가 만든건사용자정의 클래스
	//클래스는 멤버필드와 멤버 메소드를 가지고있다.
		String name;
		boolean power;
		int channel;
		
		void changerPower() {
			power=!power;
		}
		void channelUP() {
			channel++;
		}
		void channelDown() {
			channel--;
		}
	}

