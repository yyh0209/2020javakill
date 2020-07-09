package com.kita.level5;

public class PlayerTest {
	public static void main(String[] args) {
		CDPlayer player=new CDDPlayer();//abstract를 붙이면 객체생성불가.
		player.play();//플레이라는 메소드를 알고있기때문에 호출이 가능하다.
		
		Player player2 =new DVDPlayer();
		player.play();
		//DVDPlayer로 객체생성을 하면 오버라이딩이 된 play()메소드를 호출한다.
	}
}
