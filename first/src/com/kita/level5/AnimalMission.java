package com.kita.level5;

public class AnimalMission {
	public static void main(String[] args) {
		Dog dog=new Dog();
		Cat cat=new Cat();
		Sparrow spa=new Sparrow();
		
		//다 울게 만들어라.(전부호출해라.)
		//doCry메소드를 다른데에서 호출
		doCry(dog);
		doCry(cat);
		doCry(spa);
		//오버라이딩으로 해결하면 안된다.
	}
	
	
	//doCry 함수는 Animal클래스의 인스턴스를 인자로 받는다.
	public static void doCry(Animal ani) {
		ani.cry();
		ani.sleep();
		//오버라이딩이 된 하위클래스들을 호출시키는 역할을 한다.
		//그런데 하위클래스들의 메소드들을 전부 불러내는건 아니다.
	}
}
