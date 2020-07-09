package com.kita.first.level2;

public class Sortpractice3 {
	public static void main(String[] args) {
		int[] narr= {51,78,94,56,41,32,49,87};
		
		for(int i=0;i<narr.length-1;i++) {
			for(int z=i+1;z<narr.length;z++) {
				if(narr[i]>narr[z]) {
					int temp=narr[i];
					narr[i]=narr[z];
					narr[z]=temp;
				}
			}
		}
		for(int val:narr) {
			System.out.print(val+',');
		}
	}
}
