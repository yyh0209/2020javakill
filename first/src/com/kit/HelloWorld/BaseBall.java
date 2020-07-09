package com.kit.HelloWorld;
import java.util.Arrays;
import java.util.Random;
public class BaseBall {
	private int[] rArr;//rArr배열 
	public BaseBall(int inum) {
		init(inum);
	}
	//인자를 받아 랜덤값을 출력
	private void init(int inum) {
		rArr=new int[inum];
		setRandom();
	}
	
	private void setRandom() {
		//랜덤값이 중복되지않게 만들어라.
		for(int i=0;i<rArr.length;i++) {
			rArr[i]=(int)(Math.random()*9+1);
			for(int j=0;j<i;j++) {
				if(rArr[i]==rArr[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(rArr));
	}
	public int get(int idx) {
		return rArr[idx];
	}
}
