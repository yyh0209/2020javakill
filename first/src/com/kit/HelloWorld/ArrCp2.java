package com.kit.HelloWorld;
import java.util.Arrays;
public class ArrCp2 {
	public static void main(String[] args) {
		int[] arr= {2,4,6,7,8,9,4,5};//int[]의 초기값을 지정한다.
		int[] arr3= copyArr(arr);//copyArr의 인자값을 배열형 변수로 받아 값을 복사한다.
		
		System.out.println(arr==arr3);
		System.out.println("arr:	"+Arrays.toString(arr));
		System.out.println("arr2: 	"+Arrays.toString(arr3));
		
		//메소드를 만들어 배열값을 복사해보자!
		
	}
	// 메인함수에서 만든 arr의 값을 copyArr메소드에 가져와서 다시 메인함수로 반환하자
	public static int[] copyArr(int[] arr) {
		int[] arr2=new int[arr.length];
		//int형 배열 arr2의 값을 
		//copyarr메소드에서 만든 매개변수 int[] arr의 길이 만큼 객체를 생성한다. 
		for(int i=0;i<arr.length;i++)
			//메인함수에서 저장한 arr의 값은 외부로 벗어나면 사용할수없다
			//따라서 인자로 넘길 arr의 값을 arr2의 값에 복사해준다
		{
			arr2[i]=arr[i];
			
		}
		return arr2;//arr2[]의 배열의 길이만큼 주소를 복사해 메인함수로 호출한다.
		//메인함수에서 배열값을 지정하면 arr의 주소만큼 값을 호출한다.
		
		//오버라이딩이란?:클래스단계에서 상위클래스내부의 메소드를 선언은 했는데 정의를 하지않은경우
		//상속받은 클래스에서 상위클래스가 정의하지못한 메소드를 정의하는 행위가 오버라이딩이라고 부른다.
	}
}
