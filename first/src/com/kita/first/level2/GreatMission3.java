package com.kita.first.level2;

public class GreatMission3 {
	public static void main(String[] args) {
		int[][] arr= {
				{90,100,88},//영어
				{34,99,45},//수학
				{98,65,87},//국어
				{100,88,10}
		};
		String[] clsArr= {"영어","수학","국어","사회"};
		int[] sumArr=new int[clsArr.length];
		for(int i=0;i<arr.length;i++) {
			for(int z=0;z<arr[i].length;z++) {
				sumArr[i]+=arr[i][z];
			}
		}
		
		int totalSum=0;//전체합계용
		int totalCnt=0;
		
		for(int i=0;i<sumArr.length;i++) {
			System.out.printf("%s합계: %d, 평균: %.1f\n",
					clsArr[i],sumArr[i],(float)sumArr[i]/arr[i].length);
			totalSum+=sumArr[i];
			totalCnt+=arr[i].length;
				
		}
		System.out.printf("전체합계: %d, 평균: %.1f\n",totalSum,(float)totalSum/totalCnt);
		}
}
