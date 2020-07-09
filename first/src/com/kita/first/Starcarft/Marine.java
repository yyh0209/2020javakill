package com.kita.first.Starcarft;

public class Marine extends Unit implements AttackUnit,Carable{
	private int damage;
	
//	public Marine(String name,int max_hp,int damage) {
//		super(name,max_hp);
//		damage=5;
//		this.damage=damage;
//	}
	//super를 외부에서 받이 장ㄶ은 이유
	public Marine() {
		super("마린",50);//hp값은 고정이다.
		damage=5;
	}
	//인터페이스로 선언한 이상
	//구현체가 반드시 있어야된다.
	@Override
	public void attack(Unit u) {
		if(u==this) {
			return;
		}
		System.out.println("두두두두");
	u.getDamage(damage);
	}
}
