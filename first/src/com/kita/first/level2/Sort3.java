package com.kita.first.level2;

public class Sort3 {
	public static void main(String[] args) {
	int[] narr= {51,78,94,56,41,32,49,87};
	int nLeast; //그 자리에 들어갈 인덱스를 찾는 역할
	
	for(int i=0;i<narr.length-1;i++) {
		nLeast=i; //0번째를 기준점
		for(int z=i+1;z<narr.length;z++) {
			if(narr[nLeast]>narr[z]) {
				nLeast=z;
			}
		}
		if(nLeast!=i) {
			int temp=narr[nLeast];
			narr[nLeast]=narr[i];
			narr[i]=temp;
		}
	}
	for(int val:narr) {
		System.out.print(val+',');
	}
	}
}
