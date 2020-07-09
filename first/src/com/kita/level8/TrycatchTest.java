package com.kita.level8;

public class TrycatchTest {
	public static void main(String[] args) throws Exception {
		math();
		
		System.out.println("ddd");
		
		div(10,2);
	}
	public static int div(int n1,int n2){
		try {
			return n1/n2;
			//나누기0으로 하면 무조건 에러가 터진다.
			//누군가 exception을 정의했다.
		}catch(Exception e)
		{//무조건 catch로 던져줘야한다.
			return 0;
		}
	}						//해결을 미루는 역할 에러는 안뜨지만
							//다른메소드에서 해결을 떠넘기는 역할.
	public static void math2()throws ClassNotFoundException {
		Class.forName("dddd");
		//Class.forname()은 예외가 발생된것 같으니 해결해라.
				//해결방법
				//surround with try,catch로 해결
	}
	public static void math() {
		int nResult=1;
		try {
			nResult=10/0;
			if(nResult %2==0) {
				return;
			}
			Class.forName("");
		}catch(ClassNotFoundException e){
			//모든에러를 다잡을수있다
			//try,catch를 적을수있다.
		}
		catch(Exception e){
			//위에서 다 잡혀도 혹시 모르는 심정으로 적자.
			e.printStackTrace();//현재 확인된 에라기 뭔지를 출력
			System.out.println("예외발생");
		}finally {
			System.out.println("final");
		}
	
		//기본 모양
		try {
			math2();
			//예외가 발생하면 catch로 넘어감
			//예외가 발생할것 같은 친구를 감싼다
		}catch(Exception e) {
			e.printStackTrace();//0으로 나누면 에러가 터진다.
			System.out.println("예외발생");
			//예외가 터졌다면 실행
			//아니라면 try에서 해결된것이다.
		}finally{
			System.out.println("final");
			//무조건 실행됨.
		}//옵션
		//무조건 프로그램이 터지든 안터지든 실행
		//런타임오류가 뜰때 프로그램이 종료가 된다.
		//프로그램과 서버,앱이 터지는걸 방지할 목적
		//어쨋든 해결은 봐야한다.

		System.out.println("fResult:" );

		System.out.println("exit");
	}
}
