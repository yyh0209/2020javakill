package com.kita.first.level4;

public class ValueTest {
	public static void main(String[] args) {
	String str=new String("A");
	String str2=new String("A");
	
	System.out.println("1: "+str==str2);
	//주소값을 비교하니 false
	System.out.println("2: "+str.equals(str2));
	//값을 비교
	//string은 자기가 재정의해서 쓰고있다.
	//equals은 overriding
	Value val1=new Value(1);//새로운 객체는 각기 다른 주소를 갖는다.
	Value val2=new Value(1);
	
	//오브젝트에 구현된걸 비교
	System.out.println("3: "+(val1==val2));//주소값을 비교
	System.out.println("4: "+val1.equals(val2));//이걸 true로 만들게하라.
	//true가 뜨게 하라
	//value는 멤버필드가 private다.
	//equals는 object로 부터 상속받음
	//오브젝트에 구현되있는 내용을 쓴다..
	//오브젝트는 주소값을 비교
	//overriding이 되어있다.
	//미션1.true가 나오게 해라.
	}
}
