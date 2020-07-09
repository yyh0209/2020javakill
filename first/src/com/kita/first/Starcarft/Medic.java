package com.kita.first.Starcarft;

public class Medic extends Unit{
	public Medic() {
		super("메딕",70);//부모생성자를 쓸수있다.
		//메소드호출은 extends의 unit에서 이뤄졌다.
	}
	
	public void heal(Unit unit) {
		//마린만 치료할수있게 만들려면.
		//unit의 객체가 형변환이 가능하면 true
		if((unit instanceof Carable)==true) {
			unit.setCurrent_hp(unit.MAX_HP);
			//현재 heal메소드의 매개변수로 unit클래스의 인스턴스가
			//unit인데 
			//단순히 MAX_HP를 매개변수로 받으면 Medic의 HP가 오르는현상이 발생함.
			//그런데 unit의 멤버로 MAX_HP를 받으면 marine,firebat한테 적용이 된다.
		}//만약unit 자신이 자기를 참조하거나 같거나 유닛이 형변환이 불가하다면 false를 출력
		else if(unit==this||(unit instanceof Carable)==false) {
			System.out.println("치료할수 없습니다.");
			return;
		}
	}
}
