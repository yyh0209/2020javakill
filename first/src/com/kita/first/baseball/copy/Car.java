package com.kita.first.baseball.copy;
//생성자 예제
public class Car {
	private String name;
	String color;
	int cc;
	/* 이건 메소드다
	 * 메소드에서는 생성자호출을 할수없다.
	 * 이 자바객체의 최상위부모다.
	 * 변수는 무조건 프라이빗이다.
	 * 유일하게 퍼블릭을 선언할수있는변수는 상수밖에 없다.
	 * */
	public void introduceMyCar() {
		System.out.printf("%s의 컬러는%s이고 %dcc이다.\n", 
				name,color,cc);
	}
	//기본 생성자; 클래스를 초기화 해준다.디폴트 생성자라고 부른다.
		//1.이름이 클래스명과 똑같다. java만그럼
		//2.반환형이 없다
	public Car() {
		this("소나타","흰색",2500);//인자값이 있는 생성자 호출
	}
	public Car(String name, String color, int cc) {
		super(); //부모의 기본생성자 호출,슈퍼 위에는 아무것도 적을수가 없다.
		//생성자는 객체생성할때 한번만 실행되게한다.
		this.name = name;//생성자의 
		//인자값으로 저장한 멤버변수들은 부모클래스에서 선언한 멤버변수를 대입한다
		//this.부모클래스 멤버변수=생성자 인자로 받은 멤버변수
		this.color = color;
		this.cc = cc;
		
		//코드를 몰어주면 장점이 많다.
		//코드를 분산시키면 줄낭비가 심해진다.
		//
	}
	
	public Car(String name) {
		this(name,"검정색",3500);
		//this포인터는 부모클래스의 멤버변수 주소를 저장한다.
		//this포인터는 부모클래스의 멤버변수 주소를 저장한다.
	}}
