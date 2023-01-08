package ch07.ex06.case03;

public interface Animal {
	default void eat() { //default메서드
		System.out.println("먹다.");
	}
	
	void move(); //추상메서드
}
