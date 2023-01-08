package ch06.ex03.case02;

public class Dog extends Animal {
	@Override //상속받은 몸체를 덮어쓰기 하는것이다.
	public void shout() {
		System.out.println("멍멍");
	}
}
