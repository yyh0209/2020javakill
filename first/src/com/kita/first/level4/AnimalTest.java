package com.kita.first.level4;

public class AnimalTest {
	public static void main(String[] args) {

		
		Bird bird = new Bird("참새");
		Bird bird2 = new Bird("기러기");

		bird.whoAmI();
		bird2.whoAmI();
		
		Sparrow sparrow=new Sparrow();
		sparrow.whoAmI();
	}
}
