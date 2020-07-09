package com.kit.HelloWorld;

public class BoardVO {
	private String title; //같은 패키지 안에서 적용
	private String content; 
	private int writeID;
	//static이 안 붙은 건 객체마다 다른값을 저장시키기위한 용도다.
	//private는 정보보안상 은닉을 위해서 필요하다.
	//값을 넣는 방법 1.생성자 2.메소드 set,get을 이용
	public BoardVO(String title,String content,int writeID) {
		super();
		this.title=title;//this를 쓰는 이유는 매개변수와 이름이 같아서
		this.content=content;//
		this.writeID=writeID;
	}
	
	public BoardVO() {
		//기본생성자는 컴파일러가 호출
	}
	public String getTitle() {//값을 뺄수있는 무언가
		return title;//
	}
	public void setTitle(String title) //메소드를 이용
	//무조건 set으로 시작하고 그다음 변수명이 와야된다.
	//그리고 똑같은 인자값은 클래스변수와 같은 자료형으로 정의해야된다.
	{
		this.title=title; //private으로 선언된 변수를 쓰기 위해선
		//매개변수를 대입하여 get 함수로 인자로 넘겨준다.
	}
	public String getContent() {
		return content;
		}
	public void setContent(String content) {
		this.content=content;
	}
	public int getID() {
		return writeID;
	}
	public void setID(int writeID) {
		this.writeID=writeID;
	}
	
	//get
	


}

//private	같은 클래스 내
//default	private+같은 패키지
//protected	default+ 상속관계
//public 	