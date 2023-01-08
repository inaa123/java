package ch07.ex06.case02;

public class Main {
	public static void main(String[] args) {
		Life alien1 = new Alien();
		Alien alien2 = new Alien();
		
		alien1.eat(); //Life타입의 eat
		alien2.eat(); //Alien타입의 eat
		
		alien1.shout(); // Life의 shout, 오버라이드 -> 자식메서드실행
		alien2.shout(); // Alien의 shout
		
		Life.eat(); //static메서드는 접두사로 클래스명을 쓰기. 안그러면 인스턴스메서드로 왜곡할가능성있음.
		Alien.eat();
	}
}
