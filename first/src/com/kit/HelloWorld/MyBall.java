package com.kit.HelloWorld;
import java.util.Scanner;
public class MyBall {
	//myball클래스 정의
	private int[] myArr;
	private Scanner scan;//입력값을 받는 scan을 private로 제한.
	//scanner를 전역변수로 만들자.
	
	public MyBall(int num) {
		init(num);//init함수의 인자값을 myBall에 전달.
	}
	
	private void init(int num) {
		myArr=new int[num];//인자값을 받는 정수형 배열을 함수로 전달.
		scan=new Scanner(System.in);//입력값을 받는다
	}
	
	
	void setNumbers() {
		
		/*for(int i=0;i<myArr.length;i++) {
			System.out.printf("숫자%d: ",i+1);	//
			myArr[i]=scan.nextInt();//myArr에 입력값을 대입한다..
			for(int j=0;j<i;j++) {//중복값을 체크하는 구간
				if(myArr[i]==myArr[j])//입력받은 myArr의 값이 j의 값을 비교했을때
				{
					i--;//이중반복문 j에서 입력값[i]이 j와 같을때 
					System.out.println("입력값이 중복됐습니다.");
					break;//제일 가까운 반복문을 빠져나가 i를 감소하여 이전단계로 돌아간다.
				}
			}
			if(myArr[i]<1||myArr[i]>9)//범위를 지정 
		{
			System.out.println("범위를 벗어났습니다.");
			i--;//입력한 값이 1미만 9초과 일때  i를 감소시켜 이전단계로 돌아간다.
				}
			
			}		*/
		//try catch로 예외처리를 해주는데 프로그램이 죽거나,종료되기 싫다면 써줘야한다
		for(int i=0;i<myArr.length;i++) {
			System.out.printf("숫자 %d: ",i+1);//
			String val=scan.nextLine();//문자를 입력
			try {
				//예외처리
				myArr[i]=Integer.parseInt(val);//입력받은 문자를 정수로 변환//parseint가 받는 타입은 문자String
				//에러가 스킵된다. 에러가 터졌다면 잡히면 그 자리에 0을 넣어주고 아니라면 진행
			}catch(Exception e) {
				myArr[i]=0;//에러가 터지면 실행된다. 아래의 break문에 걸리면 0을 넣어서 예외시킨다.
			}
			if(myArr[i]==0) {//
				i--;
				System.out.println("숫자만 입력하세요");
				continue;//i라운드를 빠져나가지 않고 경고처리만 해준다
				//넘어간다.
			}
			if(myArr[i]<1||myArr[i]>9) {//1~9를 벗어난 값을 입력했을때
				i--;
				System.out.println("1~9값만 입력하세요");
				continue;
			}
			for(int j=0;j<i;j++) {
				if(myArr[i]==myArr[j]) {
					i--;
					System.out.println("중복된 값이 존재합니다.");
					break;
					//여기에 걸린다.
				}
			}
		}
		}
	public int get(int idx) {
		return myArr[idx];//get 함수는 set함수에서 
	}
	}
