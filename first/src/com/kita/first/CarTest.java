package com.kita.first;

import com.kita.first.baseball.copy.Car;

public class CarTest {
  public static void main(String[] args) {
	  Car car=new Car();//무조건 생성자를 호출해야된다.
	  Car car1=new Car("그랜저","검은색",3000); //()생성자
	  Car car2=new Car("그랜저");
	  Car car3=new Car("G80");
	  Car car4=new Car(3500);//cc만 받는 정수를 더 만들어야된다.
	  
	  car.introduceMyCar();
	  car1.introduceMyCar();
	  car2.introduceMyCar();
	  car3.introduceMyCar();
	  System.out.println("---");
  }
}
