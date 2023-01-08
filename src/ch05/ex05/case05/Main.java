package ch05.ex05.case05;

public class Main {
	public static void main(String[] args) {
		Apple apple = new Apple(); //한손엔 사과를 들고있다.
		Basket basket = new Basket();  // 다른 손엔 바구니를 들고 있다.
		
		basket.setApple(apple);
		basket.getApple();
	}
}
