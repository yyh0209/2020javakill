package com.kita.first.level4;

public class ClassTest2 {
	public static void main(String[] args) {
		ClassA clsA=new ClassA();
		
		clsA.Print();
		//clsA.showMe();
		ClassB clsB=(ClassB)clsA;//classA를 classB로 강제형변환 
	}
}
