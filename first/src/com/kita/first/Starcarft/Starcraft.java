package com.kita.first.Starcarft;

public class Starcraft {
	public static void main(String[] args) {
		Marine m1=new Marine();//마린보다 유닉으로 하는게 낫다.
		Marine m2=new Marine();
		Medic medic=new Medic();
		FireBat fb=new FireBat();
		
		fb.attack(m1);
		fb.attack(m1);
		fb.attack(m1);
		
		System.out.println(m1);
//		m1.attack(fb);
//		m1.attack(fb);
//		m1.attack(fb);
//		System.out.println(fb);
		
		//빨간줄 안뜨게 해보자.
//		medic.heal(fb);//치료가 안되고
		medic.heal(m1);//치료가 되야함.
		System.out.println(m1);
		//fb라는 타입이 가리키고있는 객체가 형변환이 가능하면 true  아무런 상속관계가 아니라면 false를 출력
		System.out.println(fb instanceof Carable);//이 친구의 주소값이 형변환이 가능하냐.
		System.out.println(fb instanceof Carable);
//		m1.attack(m2);//객체 새로 만들고 attack 메소드를 호출하여
//		//출력한다. 클래스 unit에서 새로 객체생성한 u에 있는 getDamage메소드가
//		//current_hp에서 damage만큼의 값만큼 감소한다.
//		m1.attack(m2);
//		//문제 자기가 자기를 공격하게해도 hp가 깍인다.
//		//이걸 방지하라.
//		m2.attack(m2);
//		System.out.println("m1:"+m1);
//		System.out.println("m1:"+m2);
//		System.out.println("m2:"+m2);
		//com.kita.first.Starcarft.Marine@15db9742
		//이거말고
		//마린,현재 HP:50 이렇게 찍히고 싶다.
	}
}
