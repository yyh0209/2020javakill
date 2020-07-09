package com.kita.first.Starcarft;

public class FireBat extends Unit implements AttackUnit {
	private int damage;
	public FireBat() {
		super("파이어벳",60);
		damage=7;
	}
	@Override
	public void attack(Unit u) {
		if(u==this) {return;}
		System.out.println("쒸이익");
		u.getDamage(damage);
	}
}
