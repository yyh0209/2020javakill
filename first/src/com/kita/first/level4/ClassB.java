package com.kita.first.level4;

public class ClassB extends ClassA{
	public ClassB() {
		super();
		System.out.println("나 ClassB");
	}
	@Override
	void print() {
		System.out.println("B");
	}
	void showMe() {
		System.out.println("B를 보여줘");
	}
}
