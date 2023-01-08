package ch06.ex01.case03;

public class Main {
	public static void main(String[] args) {
		Leopard leopard = new Leopard();
		Lion lion = new Lion();
		
		leopard.run();
		lion.run();
		
		leopard.eat();
		//leopard.shout();
		
		//lion.eat(); 컴파일에러. 사자에는 eat가 없음
		lion.shout();
	}
} 
