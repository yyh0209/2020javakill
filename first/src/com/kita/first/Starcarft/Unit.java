package com.kita.first.Starcarft;

public class Unit {
	//유닛의 공통적인 속성
	public final String NAME;//final은 무조건 값을 넣어야된다
	public final int MAX_HP;//
	private int current_hp;

	//생성자를 통해서 값을 넣어야된다.
	//유닛의 상태
	public Unit(String name,int max_hp) {
		this.NAME=name;
		this.MAX_HP=max_hp;
		this.current_hp=max_hp;
	}//무조건 final은 생성자에다 값을 넣는다.
	//메소드에다하면 에러가뜬다.
	
	//현재 데미지
	public int getCurrent_hp() {
		return current_hp; //현재 hp값을 반환.
	}
	//데미지 판정
	public void setCurrent_hp(int hp) {
		this.current_hp=hp;//치료 기능
	}
	public void getDamage(int damage) {
		current_hp-=damage;//damage만큼 감소한다.
		//만약 같은 편이라면 hp는 고정되야한다.
		
	}
	//이동좌표 출력
	public void move(int x,int y) {
		System.out.printf("x:%d, y:%d 좌표로 이동\n",x,y);;
	}
	@Override
	//현재상태 출력
	public String toString() {
		return String.format("%s, 현재 HP:%d", NAME,current_hp);
	}
}
