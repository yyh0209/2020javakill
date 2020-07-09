package com.kit.HelloWorld;

import java.util.Arrays;

//배열 복사
public class Arrcp {
	public static void main(String[] args) {
		int[] arr= {2,4,6,8,10};
		int[] arr2=new int[arr.length] ; //배열복사:배열 갖고있는 값을 복사하는 개념
		
		//현재 배열의 길이를 받았기 때문에 arr2는 arr의 내부 값을 알수가 없다 
		//따라서 문자열의 길이를 받은상태로 arr의 값을 복사해 출력해야한다.
		
		//false가 나온 상태로 배열의 인덱스의 길이 만큼 arr의 배열값을 출력하자.
		for(int i=0;i<arr.length;i++) {
			arr2[i]=arr[i]; //arr2[]의 배열값을 arr의 길이만큼 반복하여 
			//arr의 원소값을 arr2의 값에 복사한다.
		}
		
		arr2[2]=66;
		
		
		System.out.println(arr==arr2);
		System.out.println("arr:"+Arrays.toString(arr)); //배열값을 출력할때 찍는 메소드 toString(배열)
		System.out.print("arr2: "+Arrays.toString(arr2));//
		
		
	}
}
