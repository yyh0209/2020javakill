package com.kit.HelloWorld;
//스트라이크,아웃,볼을 판정하는 bool형 클래스
public class Checker {
	//S:0/B:0/O:0
	//값이 입력값의 범위와 가까운 범위에 있다면 s로 판정
	//만약 입력값이 범위가 s이상으로 벗어난 수라면 b
	//입력값이 3회이상 틀렸을때 out을 선언. if(ball!=gameCnt){
									//}
	//최종판정
	//성공하면 false 성공전이면 true를 반환
	//인자로 받는 변수 gameCnt=횟수,baseball=랜덤값 myball 사용자의 입력
	public static boolean check(int gameCnt,BaseBall ball,MyBall myBall) {
		//
		//숫자야구가 진행되는 횟수
		int iStrike=0;
		int iBall=0;
		//인자로 받을 gameCnt변수만큼 복사한다.
		for(int i=0;i<gameCnt;i++) {//i를 gameCnt만큼반복한다
			for(int j=0;j<gameCnt;j++) {
				if(myBall.get(i)==ball.get(j)) {
					if(i==j) {
					iStrike++;
					
				}else {
					iBall++;
				}
				}	
			}
		}
		if(iStrike==gameCnt) {
			return false;//iStrike가 gameCnt변수와 같을때 false를 반환
	}System.out.printf("Strike: %d, Ball: %d, Out: %d\n"
			,iStrike,iBall,(gameCnt-(iStrike+iBall))); return true;
		
	}
	
}
		
		
	
	
