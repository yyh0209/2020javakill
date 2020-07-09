package com.kita.first.level2;
/*
 * 난수를 넣어서 1~9사이의 랜덤값을 출력하라.
 * 단 중복되지않게.
 * */
import java.util.Random;
public class Test {
	public static void main(String[] args) {
		
		int len=3;//객체의 숫자
		int[] arr=new int[len];//3개만큼의 객체 생성
		for(int i=0;i<arr.length ;i++) {
			arr[i]=(int)(Math.random()*9+1);
			
			for(int z=0;z<i;z++) {
				if(arr[i]==arr[z]) {
					i--;
					break;
				}
				
			}
			//난수를 출력
			//랜덤값이 중복이 된다면 값을 바꾼다.
			}
		for(int val:arr) {
			System.out.println(val);
		}
	}
}
