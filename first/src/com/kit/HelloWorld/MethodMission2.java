package com.kit.HelloWorld;
//메소드명은 동사로 만들어야 한다.
public class MethodMission2 {
	public static void main(String[] args) {
		//Printstar(6);
		
		//******
		
		//Printstar(3);
		//***
		
		//printStarSquare(4);
		//****
		//****
		//****
		//****
		//printStarTri(5);
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * */
		printStarReverceTri(5);
		/*
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****   
		 * */
	}
	
	public static void printStar(int iStar) {
		for(int i=0;i<iStar;i++) {
		System.out.printf("*", iStar);	
		}
		System.out.println();
	}
	
	public static void printStarSquare(int starSquare) {
		
		for(int i=0;i<starSquare;i++) { 
				printStar(starSquare);
			}
		}
	public static void printStarTri(int star) {
		for(int i=1;i<=star;i++) {
			printStar(i);
		}
	}
	public static void printStarReverceTri(int star) {
		for(int i=star-1;i>=0;i--) {
			for(int z=0;z<i;z++) {
				printChar(' ',i);
				printStar(star-i);
			}
		}
		}
	
	public static void printChar(char ch,int Cnt) {
		for(int i=0;i<Cnt;++i) {
			System.out.print(ch);
		}
	}
	}



