package com.kita.first.level4;

public class Animal {
	private String name;
	private String type;//포유류,조류,어류,등등

//animal의 기본생성자를 넣어준다.
	//그런데 이름없이 
	//
	//생성자 호출
	protected Animal(String name,String type) {
		this.name=name;
		this.type=type;
		//
	}
	void crying() {
		System.out.println("울다~~~");
	}
	
	void eat() {
		System.out.println("먹다!");
	}
	
	void whoAmI() {
		System.out.printf("나는 %s고 종류는 %s 입니다\n",name,type);
	}
}
