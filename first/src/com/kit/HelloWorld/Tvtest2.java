package com.kit.HelloWorld;
//변수앞에 static이 붙으면 메모리에 붙는다.
//스택 영역에 new를 선언하게되면 개별주솟값에 객체가 생성한다.
//배열로 처리할떄 엄청난 수정이 필요하게된다.
//100번 복사를 해야됨. 연결리스트를 만들면 수정횟수를 줄일수있다.
public class Tvtest2 {
	public static void main(String[] args) {
	 Tv[] tvArr=new Tv[3];
	 tvArr[0]=new Tv();
	 tvArr[1]=new Tv();
	 tvArr[2]=new Tv();	 
 }
}
