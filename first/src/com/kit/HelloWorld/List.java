package com.kit.HelloWorld;
import java.util.Arrays;
public class List {

	public static void main(String[] args) {
		int[] arr= {1,2,3};
		int[] temp=new int[arr.length+1];//배열에 숫자를 넣어야할겨우
		//
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		//arr의 길이만큼 반복해 arr의 배열값을 temp의 값에 담아라
		temp[arr.length]=4;
		arr=temp;
		
		
	}

}
