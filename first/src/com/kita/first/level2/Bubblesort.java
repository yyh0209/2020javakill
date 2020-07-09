package com.kita.first.level2;

public class Bubblesort {
	public static void main(String[] args) {
		int[] arr= {58,78,65,49,34,12,54};
		for(int i=arr.length-1;i>0;i--) {
			for(int j=0;j<i;j++)
			{
				if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
			
		}
		//6,arr의 배열수만큼 반복하면서 1씩 감소한다.
		//5-4-3-2-1 내림차순을 반복
		//7,j의 초기값을0으로 정하고 i보다 작을때 까지 j를 더한다.
		//9~12:arr의 인덱스와 두번째 인덱스와 비교할때 arr[j]가 크면
		//arr[j+1]와 바꾼다.
		//큰수부터 감소한다.
		
		//for each문은 sepuence가 있는 객체(배열,리스트)는 모두 사용가능
		//객체가 가지고있는 값을 순차적으로 하나씩 넘겨준다.
		for(int val:arr) {
			System.out.print(val+" , ");
		}
	}
}
