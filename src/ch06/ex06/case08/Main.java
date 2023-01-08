package ch06.ex06.case08;

public class Main {
	public static void main(String[] args) {
		Elephant elephant = new Elephant();
		Goose goose = new Goose();
		
		//알고리즘이 같음, default 이유 : 중복최소화
		elephant.eat();
		goose.eat();
		
		elephant.move();
		goose.move();
	}
}
