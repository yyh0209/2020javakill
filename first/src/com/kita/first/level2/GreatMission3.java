package com.kita.first.level2;

public class GreatMission3 {
	public static void main(String[] args) {
		int[][] arr= {
				{90,100,88},//영어
				{34,99,45},//수학
				{98,65,87},//국어
				{100,88,10}//사회
		};
		String[] clsArr= {"영어","수학","국어","사회"};
		int[] sumArr=new int[clsArr.length];//clsArr만큼의 원소 길이를 할당.
		for(int i=0;i<arr.length;i++) {//arr의 길이만큼 i를 반복
			for(int z=0;z<arr[i].length;z++) {//arr의 길이만큼 반복되는 i만큼 z를 반복
				sumArr[i]+=arr[i][z];//sumArr의 길이만큼 arr내부의 배열의 값들을더한다
			}
		}
		
		int totalSum=0;//점수합계용
		int totalCnt=0;//전체과목의 수 나중에 평균을 내서 나누기할때 사용한다.
		
		for(int i=0;i<sumArr.length;i++) {
			System.out.printf("%s합계: %d, 평균: %.1f\n",
					clsArr[i],sumArr[i],(float)sumArr[i]/arr[i].length);
			totalSum+=sumArr[i];
			totalCnt+=arr[i].length;
				
		}
		System.out.printf("전체합계: %d, 평균: %.1f\n",totalSum,(float)totalSum/totalCnt);
		}
}
