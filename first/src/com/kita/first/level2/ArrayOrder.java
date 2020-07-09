package com.kita.first.level2;

public class ArrayOrder {
	public static void main(String[] args) {
		int[] arr= {29,33,15,88,5,46,92,1,19};
		//순차정렬
		for(int i=0;i<arr.length-1;i++)
			//arr.length-1은 제일 마지막은 비교할 필요가 없다.
		{
			for(int z=i+1;z<arr.length;z++) {
				if(arr[i]>arr[z]) {
					int temp=arr[i];
					arr[i]=arr[z];
					arr[z]=temp;
				}
			}
		}
		//초기값을0부터 시작해 배열수만큼 점차 늘려간다.
		//이중반복문엔 두번째 원소를 배열수만큼 반복한다.
		//arr[i]가 arr[z]와 비교했을때 i가 크면 z와 바꾼다.
		for(int val: arr) {
			System.out.println(val+",");
		}
		
		}
	}
