package com.kit.HelloWorld;
import java.util.Random;
public class Game {
 public static void main(String[] args) {
	 //게임은 여기서 진행된다.
	 int gameCnt=3;
	 if(args.length!=0) {
		 try {
			 gameCnt=Integer.parseInt(args[0]);
		 }catch(Exception e) {
			 
		 }
	 }
	 System.out.printf("%d개 숫자야구게임 Start\n",gameCnt);

	 //인자값만큼 랜덤값을 만들어라.
	 //4를 보내면 4개짜리 랜덤값을 보내라.
	 
	BaseBall ball=new BaseBall(gameCnt);
	 MyBall myBall=new MyBall(gameCnt);//MyBall의 인스턴스를 생성해
	 //gamecnt만큼의 객체를 생성한다.
	 do {
		 myBall.setNumbers();
	 }while(Checker.check(gameCnt, ball, myBall));
	 //myBall클래스내의 함수를 호출
	
	 
	 //반복 횟수를 출력
	 //숫자1:3 숫자가 지날때마다 랜덤값을 출력한다.
	 //숫자2:6
	 //숫자3:8//중복된 숫자가 나올경우 잘못입력했다는 메세지가 나와야된다.
	 System.out.println("게임 종료!");
 }
}
