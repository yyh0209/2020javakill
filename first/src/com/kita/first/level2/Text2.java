package com.kita.first.level2;
import java.util.Random;
//0~9까지의 난수를 출력하자,중복방지
public class Text2 {
	public static void main() {
		int len=3;
		int[] arr=new int[len];
		
		//반복문
		for(int i=0;i<arr.length;i++) {//배열의 길이만큼 반복
			arr[i]=(int)(Math.random()*9+1);//1~9까지 엘리먼트를 정의
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					i--;
					break;				//arr[i]의 값이 arr[j]안의 원소와 중복될때
				}						//i를 빼서 중복을 방지하고 if문을 빠져나간다
			}
		}
			for(int val:arr) {			//for each구문
				System.out.print(val);	//for(A:B):B에서 차례대로 객체를 꺼내서 A에다 넣는다
			}
	}
	}
