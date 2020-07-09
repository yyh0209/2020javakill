package com.kit.HelloWorld;

import java.util.Arrays;

	public class MyListTest {//메인메소드를 지을려면 파일명과 똑같은 이름,public을 써야된다.
		public static void main(String[] args) {
		MyList list=new MyList();//mylist를 객체화했다.
		list.add(10);//변수는 1개의 값을 저장할수있다.
		list.add(15);
		list.add(20);
		list.add(1,1200);//10,15,20>10,100,15,20
		
		list.remove();
		
		MyArrays.print(list);
		//MyArrays는 클래스다 print는 클래스안의 메소드를 가리킨다.
		
		//선언부를 만들자
		//출력을 해보자!
		int delVal=list.remove(1);
		int len=list.size();//2 //배열 사이즈
		int val=list.get(1);//15 //배열의 1번째 값
		val=list.get(0);//10 배열의 0번째값
		//get은 list의 배열의 값을 복사해 인덱스 번호를 찍으면 인덱스의 값이 나온다.
		
		//list.remove(1);//길이를 지운다. 중간에 삭제가 온다
		//temp를 쓰거나
		MyArrays.tostring(list);
	}
	
}
//void형 메소드용 사용자 정의
class MyList {
	private int[] arr;//한칸을 저장해야된다. 변수선언만 한다.
	
	MyList() {
		init();
	}
	
	private void init() {
		arr=new int[0];//arr의 객체를 생성 mylist의 생성자로 반환 
	}
	
	int size() {
		return arr.length;//arr의 길이를 정수로 반환
	}
	
	int get(int idx) {
		return arr[idx];//arr의 배열값을 반환
	}
	
	//arr[i]=10
	//i= 인덱스 번호
	/*void remove(int idx) {
		int temp[]=new int[arr.length-1];//임시객체 temp를 arr의 길이의 -1만큼 객체생성을 한다.
		for(int i=0;i<temp.length;i++) {
			if(i >= idx) {
				temp[i] = arr[i+1];//만약 i의 값이가 arr의 값보다 클때
				//arr의 다음 인덱스의 값을  temp의 i에 대입한다
			} else {
				temp[i]=arr[i];//temp의 값을 arr의 값에 대입
			}
		}
		arr=temp;
		
		System.out.println(Arrays.toString(arr));
	}*/
	
	
	//[10,1200,15]프린트 되도록 toString(arr) 함수와 똑같은 기능을 만들어보자!
	//void형으로 만들어보자.
	
	int remove(int idx) {//정수형의 값을 제거하는 기능을 가진 메소드를 만들자!
		int[] Temp=new int[arr.length-1];//객체의 길이를 한칸 뺀다.
		for(int i=0;i<Temp.length;i++) {
			if(i<idx) {
				Temp[i]=arr[i];
			}else {
				Temp[i]=arr[i+1]; //arr의 다음 인덱스 값을 temp의 인덱스값에 넣는다.
			}
		}
		int delVal=arr[idx];//마지막 값을 지우고, 지우는 값을 리턴(20)
		arr=Temp;
		return delVal;
	}
	int remove() {
		return remove(arr.length-1);
	}
	//늘림 값 복사 
	//인덱스 번호를 비교
	
	void add(int num) {
		int temp[]=new int[arr.length+1];
		
		//arr의 길이에 한칸을 더 추가한다.
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		//temp를 arr의 길이만큼 반복된 값들을 temp에 담는다.
		temp[arr.length]=num;
		//그렇게 반복한 값을 매개변수로 저장된 
		//num을 temp로 
		arr=temp;
		//temp에 저장된 값은 arr로 넘겨준다.
		//전역변수로 선언한 arr의 값에 담는다.
		System.out.println(Arrays.toString(arr));
	}
	void add(int idx,int num) {
		int[] temp=new int[arr.length+1]; //객체의 길이를 한칸 보충한다.
		
		for(int i=1;i<temp.length;i++) {
			/*if(i<idx) {
				temp[i]=arr[i]; //인덱스 번호는 안에있는 값을 말한다.
			}else {
				temp[i+1]=arr[i];
			}*/
			temp[i-1]=idx<i? arr[i-1]:arr[i];
			
		}
		temp[idx]=num;
		arr=temp;
		System.out.println(Arrays.toString(arr));
	}
	//1번째 인자는 인덱스//두번째 인자는 인덱스 값을 넣어라.
			//순서
			//1.반복문을 돌려 arr의 배열 길이만큼 반복한다.
			//2.i가 arr의 길이만큼 반복할때 만약 인덱스가 i보다 클경우 temp의 인덱스 값을 arr의 인덱스값에 대입한다.
			//3.아닐경우 temp의 다음값을 arr의 인덱스값에 대입한다.
			//4.그리고 인자로 넘겨줄 num의 값을 temp의 idx의 값에 대입한다
			//5.넘겨받은 temp의 값을 arr에 넘겨준다.
	
}
//기존의 mylist클래스를 이용해보자.
class MyArrays{
	
	static void print(MyList list) {//arrays.tostring 을 구현하라.
		System.out.print("[ ");
		for(int i=0;i<list.size();i++) {
			System.out.printf(i<list.size()-1?"%d,":"%d",list.get(i));
			//삼항 연산자를 활용해 i가 list의 길이를 정수로 반환했을때
		}
		System.out.print("] ");
	}
	//size():arr의 길이를 정수로 반환
	//"[10,1200,15]"를 문자열로 리턴해라!  메소드를 구현해라.
	//print메소드가 tostring메소드를 이용할수있다.
	static String tostring(MyList list) {
		String str="";
		for(int i=0;i<list.size();i++) {
			if(i>0) {
				str+=", ";
			}
			str+= list.get(i);
		}
		return String.format("[%s]",str);
	}
	static void Print(MyList list) {
		System.out.println(tostring(list));
	}
}
