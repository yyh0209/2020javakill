package com.kita.first.level2;

public class Mission6_3 {
	public static void main(String[] args) {
		int dan=0;
		int num2=0;
		for(dan=26;dan<34;++dan) {
			for(num2=1;num2<10;++num2) {
				int i=dan-24;
				System.out.printf("%d X %d=%d\n",i,num2,(i*num2));
			}
			System.out.println("=============");
		}
	}
}
