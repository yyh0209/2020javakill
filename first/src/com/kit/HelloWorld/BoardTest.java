package com.kit.HelloWorld;

public class BoardTest {
	public static void main(String[] args) {
		BoardVO bv1=new BoardVO("제목1","내용1",1);
		
		BoardVO bv2=new BoardVO();
		//기본생성자는 자동으로 넣어줬는데 생성자가 하나도 없을때만 컴파일러가 넣어준다.
		//막을때 쓰는 방법.
		bv2.setTitle("제목2");
		bv2.setContent("내용2");
		bv2.setID(2);
		
		System.out.println("bv2 제목:"+bv2.getTitle());
	}
}
