package ch05.ex05.case05;

public class Basket {//멤버변수 타입이 apple. 바구니안에 apple객체가담기는 것.
	private Apple apple; // Basket has ans Apple. 바구니가 사과를 담고있다.

	public Apple getApple() {
		return apple;
	}

	public void setApple(Apple apple) {
		this.apple = apple;
	}
}
