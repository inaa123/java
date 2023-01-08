package ch07.ex05.case01;

public class Main {
	public static void main(String[] args) {
		Basket<Apple> basket =  new Basket <Apple>(); 
		//변수의타입은 바스켓애플 이 되는거임!! 그냥 바구니X 사과바구니ㅇ!!!
		basket.set(new Apple());
		System.out.println(basket.get());
		
		//basket.set(new Grape()); 사과바구니에 포도X 사과바구니에 SETGRAPE는 존재하지 않는것임.
		
		//포도바구니
		Basket<Grape> basket2 = new Basket<Grape>(); //디자인 확장성 생김~
		basket2.set(new Grape());
		System.out.println(basket2.get());
	}
}
