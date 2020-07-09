package com.kita.level5;

public class AnimalTest {
	public static void main(String[] args) {
		Animal ani=new Dog();
		ani.cry();
		ani=new Cat();
		ani.cry();
		
		Cat cat=(Cat)ani;
		cat.cry();
		cat.sleep();
	}
	//자식클래스가 갖고있는 메소드를 부모클래스는 강제형변환을 통해서만 할수있다.
	
}
