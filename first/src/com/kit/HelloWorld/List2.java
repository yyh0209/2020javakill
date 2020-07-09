package com.kit.HelloWorld;
import java.util.ArrayList;
public class List2 {
	public static void main(String[] args) {
		Object obj=1;
		obj="aaa";
		obj=1.1;
		//사용할려면 강제형변환을 해줘야한다.
		
		ArrayList <Integer>list=new ArrayList();//이거쓰면 형변환안해줘도 된다.
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(10);
		list.add(2,11);
		list.remove(list.size()-1);//리터럴을 사용하지말고 사이즈를 사용해라
		list.remove(list.size()-1);
		
		int value=list.get(2);
		System.out.println(value);
		//1,2,11,30
		//add함수는 값을 복사해 list의 값에 반환 해준다.
		/*for(int i=0;i<list.size();i++) {
			int val=list.get(i);
			System.out.print(val+",");
		}*/
		//"Object"는 가장 최상위 부모로 자식클래스는 상속을 받는다.
		int i=0;
		for(int val:list) {
			System.out.printf(val+",");
		}
	}
}
