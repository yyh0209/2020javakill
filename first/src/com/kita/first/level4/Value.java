package com.kita.first.level4;

public class Value {
	//class 앞에는 final과 static을 붙일수있는데 final을 붙이면 상속불가
	//final은 식별자뒤에 붙여도되고 클래스 뒤에 붙여도됨.
	//접근제어자 final 
	//String을 가져다 다른 클래스로 만들어야됨.
	//메소드앞에 붙이면 오버라이딩 금지
	//자바문법은 생각보다 많이 안쓴다.
	private int val;
	public Value(int val) {
		this.val=val;
	}
	public int getVal() {
		return val;
	}
//	public String toString() {
//		return  "2"; 리터럴값이 아니다.
//	}
	@Override
	public String toString() {
		
		//리턴이 목적
		return String.format("%d", val); //추천!int를 String으로 변환
		//return String.valueOf(val);//
	}
	@Override
	public boolean equals(Object obj) {
		Value objval=(Value)obj;
		//인스턴스 val를 "인자로 받을 obj"의 값을 Value로 강제형변환 시켜 대입시킨다.
		//if(this.getVal()==val.getVal()) {
			//return true;//Value의 getVal
			//메소드의 val와 
			//인자값 의 값이 서로 같다면 true를 반환한다.
		
		//또는 return 키워드로 참,거짓을 판단하는 방법이 있는데
		//value 클래스의 val의 value인스턴스인 인자값을 대입한
		//objVal를 비교하여 
		return this.val==objval.getVal();
	}
	//핵심은 메인함수에서 비교되는 
	//거짓이 나오면 호출됨
	//형변환을 해줘야한다.
	//상속관계에선 형변환이 가능하다.
	//value주소값을 보냇다, val의 값을 얻어야된다.
	//val의 값을 얻을려면 getVal메소드를 호출해야된다.
}
