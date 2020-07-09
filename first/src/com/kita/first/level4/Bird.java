package com.kita.first.level4;

public class Bird extends Animal{
	//모든객체는 객체부터 먼저 만들고 그 다음에 자식을 만든다. 그리고 자식은 부모를 참조한다.
	//bird의 생성자를 추가하고나니 빨간줄이뜬다.
	
	//패키지가 다르더라도 상속관계에 속해있으면 허용
	protected Bird(String name) {
		super(name,"조류");//부모의 기본생성자가 없으니 빨간줄이 뜬다.
		//1.animal에 기본생성자를 넣어준다.
		//2.부모의 생성자를 호출한다.
		//3,
	}
	void flying(){
		System.out.println("훨훨");
	}
	
	@Override //습관적으로 오버라이딩이라는걸 붙여줘야 다형성을 살릴수있다.
	void crying() {
		super.crying();//super는 바로 위의 부모를 지칭해 함수를 호출할수있다.
		System.out.println("짹짹!");
	}
}
