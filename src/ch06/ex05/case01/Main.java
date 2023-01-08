package ch06.ex05.case01;

public class Main {
	public static void main(String[] args) {
		Shoes shoes = new Shoes(1000); //new Shoes로 만ㄷ르어진 객체에는 price가 두개얌
		
		System.out.println(shoes.getPrice());
	}
}