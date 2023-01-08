package ch06.ex06.case08;

public interface Animal {
 	//void eat(); 확장하려고 함.
	//void eat() { } 추상메소드에 바디가 생기면 에러! 추상메소드는 바디가 필요없으니
	default void eat() { //default접근자 넣어줘야함. 군데 왜 하필 default?
		System.out.println("입으로 먹다.");
	}
	
	void move(); //몰라 날아가는지 걸어가는지 몰라
	
}
