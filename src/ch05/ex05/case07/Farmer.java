package ch05.ex05.case07;

public class Farmer { //농부 사과를 판다.
	public Apple sell(int price) { //가격을 파라미터로 둔다.
		Apple apple = new Apple();
		apple.setPrice(price);
		
		return apple; //파라미터는 기본타입 리턴 타입은 클래스! (객체도 데이터!기때문)
	}
}
