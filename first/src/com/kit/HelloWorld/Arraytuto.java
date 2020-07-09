package com.kit.HelloWorld;

public class Arraytuto {
	public static void main(String[] args) {
		int[] iArr=new int[4];
		iArr[0]=40;
		iArr[1]=50;
		iArr[2]=60;
		iArr[3]=70;
		//객체생성 new로 int 형 변수를 100개 생성함.
		//각 주소값에는 NULL이 저장되었다.
		//동적할당을 하는 이유는 나중에 필요한 변수가 생기기때문이다.
		//또한 동작할당은 실수를 방지하기 위함이다.
		//배열 쓰는 이유 변수선언을 덜하고싶기때문.
		//주소가 나열되있어 메모리관리하기 쉽다.
		//for문을 이용할때 유용하다.
		char[] szbuffer=new char[20];
		//20개의 메모리를 동적할당
		float[] farr=new float[10];
		String[] sarr=new String[100];
		sarr[0]="이호식";
		sarr[1]="이삼식";
		sarr[2]="최치식";
		sarr[3]="김용식";
		//new키워드를 써서 만드는 방법
		//boolean[]=new boolean[100]일 경우 각 방에는 false(0)가 저장되어있다
		
		int[] iArr2= {10,20,30,40};
		int[] iArr3= iArr2;
		System.out.println(iArr2);
		
		int[] arr7=new int[50];
		for(int i=0;i<arr7.length;i++) {
			arr7[i]=5;
		}
		for(int i=0;i<arr7.length;i++) {
			System.out.println(i+":"+arr7[i]);
		}
		//재사용성이 높아진다.
	}
}
