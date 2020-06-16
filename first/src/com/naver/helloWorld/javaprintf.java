package com.naver.helloWorld;

public class javaprintf {

	public static void main(String[] args) {
		int nAge=2500;
		String Name="유영혁";
		float vision=1.0f;
		char bloodtype='O';
		/*System.out.print("나의 이름은"+Name+"입니다. 나의 나이는"+nAge
				+"입니다. 나의 시력은"+vision+"입니다.나의 혈액형은"
				+bloodtype+"입니다.");*/
		System.out.printf("나의 이름은 %s,나의 나이는%d,나의 시력은 %.1f, 나의 혈액형은 %c\n"
				,Name,nAge,vision,bloodtype);
		/*형식문자열:
		 * %d:정수
		 * %s:문자열
		 * %f:실수형
		 * %c:문자
		 * */
		char v1='A';
		System.out.printf("%c:%d\n",v1,(int)v1);
		
		int v2=66;
		System.out.printf("%c:%d\n",(char)v2,v2);
	}

}
