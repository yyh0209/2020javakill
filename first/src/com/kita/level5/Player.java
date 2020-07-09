package com.kita.level5;
//추상클래스
public abstract class Player {
	
	//
	//추상메소드를 하나라도 갖고있으면 무조건 메인 클래스 앞에도 abstract를 붙여줘야된다.
	public abstract void play();//메소드를 선언만 하고 정의를 하고싶진않다 선언만 있고 내용은 없다.
	//다만 객체를 못만들고 타입으로써 부모역할만 하겠다.
	//목적은 하위클래스에 특정기능을 만들도록 강제하고자 하는게 목적이다.
	//그렇게 해서 특정기능이 다 공통적으로 존재하게 된다.
	public void stop() {
		System.out.println("재생을 멈췄다.");
	}
}

abstract class CDPlayer extends Player{
	public abstract void ff();
}
//왜 오버라이딩을 안해주냐면서 빨간줄이뜬다.
class CDDPlayer extends CDPlayer{
	@Override
	public void play() {
		System.out.println("CD를 재생합니다.");
	}
	
	public void ff() {
		
	}
}
//구현되지않는 메소드를 추가
class DVDPlayer extends Player{
	@Override
	public void play() {
		System.out.println("DVD를 재생합니다.");
	}
}
